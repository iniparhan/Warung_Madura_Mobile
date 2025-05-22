package com.example.demo.report;

import com.example.demo.model.Transaction;

import java.util.Date;
import java.util.List;

public class Report {

    private String reportId;
    private List<Transaction> transactions;
    private Date reportDate;
    private double totalSales;

    public Report(String reportId, List<Transaction> transactions, Date reportDate) {
        this.reportId = reportId;
        this.transactions = transactions;
        this.reportDate = reportDate;
        this.totalSales = summarize();
    }

    public double summarize() {
        double sum = 0;
        for (Transaction t : transactions) {
            sum += t.getTotalAmount();
        }
        return sum;
    }

    // Getters and setters
}