package com.rwl.librarymanagementsystem.Repository;


import com.rwl.librarymanagementsystem.Entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}
