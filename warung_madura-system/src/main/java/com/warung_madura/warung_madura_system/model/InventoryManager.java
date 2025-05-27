package com.warung_madura.warung_madura_system.model;

public class InventoryManager extends User {

    public InventoryManager(String id, String name) {
        super(id, name, "InventoryManager");
    }

    @Override
    public void showMenu() {
        System.out.println("Inventory Manager Menu: Add Product, Update Stock.");
    }

    public void addProduct(Product product) {
        System.out.println("Adding product: " + product.getName());
    }
}