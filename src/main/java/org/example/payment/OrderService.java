package org.example.payment;

public class OrderService {
    private PaymentService paymentService;
    private StockService stockService;

    public OrderService(PaymentService paymentService, StockService stockService) {
        this.paymentService = paymentService;
        this.stockService = stockService;
    }

    public boolean placeOrder(String productId, int quantity) {
        if (!stockService.isAvailable(productId, quantity)) {
            return false; // Pas assez de stock
        }
        boolean paymentOk = paymentService.processPayment(productId, quantity);
        if (!paymentOk) {
            return false; // Paiement refusé
        }
        stockService.reserve(productId, quantity);
        return true;
    }
}
