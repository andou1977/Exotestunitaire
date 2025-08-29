package org.example.Commande;

public class OrderService {
    private UserChecker userChecker;
    private ProductStock productStock;
    private PaymentService paymentService;
    private OrderRepository orderRepository;

    public OrderService(UserChecker userChecker, ProductStock productStock, PaymentService paymentService, OrderRepository orderRepository) {
        this.userChecker = userChecker;
        this.productStock = productStock;
        this.paymentService = paymentService;
        this.orderRepository = orderRepository;
    }


    public boolean createOrder(String userId, String productId) {
        if (!userChecker.userExists(userId)) return false;
        if (!productStock.hasStock(productId)) return false;
        boolean paid = paymentService.processPayment(userId, productId);
        if (!paid) return false;
        orderRepository.saveOrder(userId, productId);
        return true;
    }
}
