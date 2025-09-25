package org.example.Enterprise;

public class PaymentService {

    public boolean process(Order order, double amount) {
        if (amount < order.calculateTotal()) return false;
        order.markAsPaid();
        return true;
    }
}
