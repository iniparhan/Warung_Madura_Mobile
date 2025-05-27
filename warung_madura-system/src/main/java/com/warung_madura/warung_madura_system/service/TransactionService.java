package com.warung_madura.warung_madura_system.service;

import com.warung_madura.warung_madura_system.model.Transaction;
import com.warung_madura.warung_madura_system.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public List<Transaction> getTransactionsByCashierName(String cashierName) {
        return transactionRepository.findByCashierName(cashierName);
    }

    public List<Transaction> getTransactionsByProductName(String productName) {
        return transactionRepository.findByProductName(productName);
    }

    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}
