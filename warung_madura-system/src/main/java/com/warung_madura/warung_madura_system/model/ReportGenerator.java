package com.warung_madura.warung_madura_system.model;

public class ReportGenerator {
    public Report generateSalesReport() {
        return new Report("Sales Report", "Total sales: 100 units.");
    }

    public Report generateInventoryReport() {
        return new Report("Inventory Report", "All products in stock.");
    }
}