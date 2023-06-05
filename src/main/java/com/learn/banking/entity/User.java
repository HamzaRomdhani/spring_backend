package com.learn.banking.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="_user")
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name ="First_name")
    private String firstName;

    @Column(name ="Last_name")
    private String lastName;

    private String email;
    private boolean active;
    @OneToOne
    private Account account;

    @OneToMany(mappedBy = "user")
    private List<Contact> contacts;

    @OneToMany(mappedBy = "user")
    private List<Transaction> transactions;


    @ManyToMany
    @JoinTable(
            name ="roles_users",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<Role> roles;

}
