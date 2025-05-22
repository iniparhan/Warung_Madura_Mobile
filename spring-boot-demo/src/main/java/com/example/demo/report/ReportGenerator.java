package com.example.demo.report;

import com.example.demo.model.Transaction;

import java.util.List;

public interface ReportGenerator {

    Report generateReport(List<Transaction> transactions);
}