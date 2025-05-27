package com.warung_madura.warung_madura_system.model;

public class Cashier extends User {

    public Cashier(String username, String name, String password, String role) {
        super(username, name, password, "Cashier");
//        public User(String username, String name, String password, String role) {
    }

    @Override
    public void showMenu() {
        System.out.println("Cashier Menu: Process Transactions, Print Receipts.");
    }

    public void processTransaction(Transaction transaction) {
        System.out.println("Processing transaction ID: " + transaction.getId());
    }
}