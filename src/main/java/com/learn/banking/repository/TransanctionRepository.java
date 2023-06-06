package com.learn.banking.repository;

import com.learn.banking.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransanctionRepository extends JpaRepository<Transaction,Integer> {
}
