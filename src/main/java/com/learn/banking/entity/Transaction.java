package com.learn.banking.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private BigDecimal amount;


    private String destinationIban;
    private LocalDate transactionDate;
    private transactionType type;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
