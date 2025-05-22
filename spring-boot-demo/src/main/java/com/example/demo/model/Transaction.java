package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.List;

@Entity
public class Transaction {

    @Id
    private String transactionId;
    private String cashier;
    private List<Product> productList;
    private double totalAmount;
    private String transactionDate;

    // Constructor, getters, and setters

    public Transaction(String transactionId, String cashier, List<Product> productList, String transactionDate) {
        this.transactionId = transactionId;
        this.cashier = cashier;
        this.productList = productList;
        this.transactionDate = transactionDate;
        this.totalAmount = calculateTotal();
    }

    public Transaction() {}

    public double calculateTotal() {
        double total = 0;
        for (Product p : productList) {
            total += p.getPrice();
        }
        return total;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }
}