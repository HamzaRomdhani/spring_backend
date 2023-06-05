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
@Table(name="contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name ="name_contact")
    private String nameContact;



    @Column(name ="First_name")
    private String firstName;


    @Column(name ="Last_name")
    private String lastName;


    private String email;

    private String iban;

    @ManyToOne
    @JoinColumn(name ="user_id")
    private User user;


}
