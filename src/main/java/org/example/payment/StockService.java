package org.example.payment;

public class StockService {
    public boolean isAvailable(String productId, int quantity) {
        // Simulation d'une vérification de stock
        System.out.println("Vérification du stock pour " + productId + " x" + quantity);
        return true;
    }

    public void reserve(String productId, int quantity) {
        System.out.println("Stock réservé pour " + productId + " x" + quantity);
    }

    }
