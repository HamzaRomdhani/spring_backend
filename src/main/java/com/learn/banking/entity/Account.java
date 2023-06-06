package com.learn.banking.entity;
import jakarta.persistence.*;
import lombok.*;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="account")
@Entity
public class Account {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(unique = true)
    private String iban;


    @OneToOne
    @JoinColumn(name ="user_id")
    private User user;

}
