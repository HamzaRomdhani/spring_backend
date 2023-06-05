package com.learn.banking.entity;
import jakarta.persistence.*;
import lombok.*;
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

}
