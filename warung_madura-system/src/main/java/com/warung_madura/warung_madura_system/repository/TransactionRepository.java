package com.warung_madura.warung_madura_system.repository;

import com.warung_madura.warung_madura_system.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByCashierName(String cashierName);
    List<Transaction> findByProductName(String productName);
}