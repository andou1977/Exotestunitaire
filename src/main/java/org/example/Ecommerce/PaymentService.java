package org.example.Ecommerce;

public class PaymentService {
    public boolean process(double amount, double balance) {
        return balance >= amount;
    }


}
