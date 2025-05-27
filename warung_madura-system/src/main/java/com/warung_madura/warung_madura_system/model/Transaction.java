package com.warung_madura.warung_madura_system.model;

import java.util.Date;

public class Transaction {
    private String id;
    private Product product;
    private int quantity;
    private Date date;

    public Transaction(String id, Product product, int quantity, Date date) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Date getDate() {
        return date;
    }
}