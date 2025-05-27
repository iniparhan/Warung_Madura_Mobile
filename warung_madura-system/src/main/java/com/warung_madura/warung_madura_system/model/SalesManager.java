package com.warung_madura.warung_madura_system.model;

public class SalesManager extends User {

    public SalesManager(String id, String name) {
        super(id, name, "SalesManager");
    }

    @Override
    public void showMenu() {
        System.out.println("Sales Manager Menu: View Sales, Generate Reports.");
    }

    public void viewSales() {
        System.out.println("Viewing sales data...");
    }
}