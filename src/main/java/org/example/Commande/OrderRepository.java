package org.example.Commande;

public class OrderRepository {
    public void saveOrder(String userId, String productId) {
        System.out.println("Order saved for " + userId);
    }
}
