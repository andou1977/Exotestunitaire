package org.example.payment;

public class PaymentService {
    public boolean processPayment(String productId, int quantity) {
        // Simulation d'un paiement réussi
        System.out.println("Paiement effectué pour le produit " + productId + " x" + quantity);
        return true;
    }


}
