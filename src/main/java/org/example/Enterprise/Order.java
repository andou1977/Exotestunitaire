package org.example.Enterprise;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String id;
    private List<Product> products = new ArrayList<>();
    private boolean paid;

    public Order(String id) {
        this.id = id;
        this.paid = false;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public void markAsPaid() { this.paid = true; }
    public boolean isPaid() { return paid; }
}
