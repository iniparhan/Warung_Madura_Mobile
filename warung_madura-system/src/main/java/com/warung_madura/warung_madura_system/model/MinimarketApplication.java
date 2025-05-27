package com.warung_madura.warung_madura_system.model;

public class MinimarketApplication {
    public static void main(String[] args) {
        Admin admin = new Admin("A1", "Admin One");
        admin.showMenu();
        admin.manageUsers();

        Cashier cashier = new Cashier("C1", "Cashier One");
        cashier.showMenu();

        Product product = new Product("P1", "Snack", 10.0, 100);
        Transaction transaction = new Transaction("T1", product, 2, new java.util.Date());
        cashier.processTransaction(transaction);
    }
}