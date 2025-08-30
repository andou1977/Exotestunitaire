package org.example.Commande;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class OrderServiceTest {



    @Test
    void createOrder(){
        UserChecker userChecker = mock(UserChecker.class);
        ProductStock productStock = mock(ProductStock.class);
        PaymentService paymentService = mock(PaymentService.class);
        OrderRepository orderRepository = mock(OrderRepository.class);

        when(userChecker.userExists("User001")).thenReturn(true);
        when(productStock.hasStock("Prod001")).thenReturn(true);
        when(paymentService.processPayment("User001", "Prod001")).thenReturn(true);

        OrderService orderService = new OrderService(userChecker, productStock, paymentService, orderRepository);
        assertTrue(orderService.createOrder("User001", "Prod001"));

    }




}
