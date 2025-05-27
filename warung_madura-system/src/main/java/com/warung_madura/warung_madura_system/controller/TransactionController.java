package com.warung_madura.warung_madura_system.controller;

import com.warung_madura.warung_madura_system.model.Transaction;
import com.warung_madura.warung_madura_system.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }

    @GetMapping("/cashier/{cashierName}")
    public List<Transaction> getTransactionsByCashier(@PathVariable String cashierName) {
        return transactionService.getTransactionsByCashierName(cashierName);
    }

    @GetMapping("/product/{productName}")
    public List<Transaction> getTransactionsByProduct(@PathVariable String productName) {
        return transactionService.getTransactionsByProductName(productName);
    }

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionService.createTransaction(transaction);
    }
}
