package com.example.demo.controller;

import com.example.demo.model.Transaction;
import com.example.demo.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private SalesService salesService;

    @GetMapping
    public List<Transaction> getAllTransactions() {
        return salesService.getAllTransactions();
    }

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return salesService.createTransaction(transaction);
    }
}