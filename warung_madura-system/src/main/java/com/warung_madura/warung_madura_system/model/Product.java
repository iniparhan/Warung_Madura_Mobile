package com.warung_madura.warung_madura_system.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private String name;
    private String unit;
    private double price;
    private int stock;

    public Product(String name, double price, int stock, String unit) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.unit = unit; // satuan produk seperti "botol", "bungkus"
    }
}