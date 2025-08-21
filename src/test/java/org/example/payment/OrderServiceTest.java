package org.example.payment;

import com.google.common.base.Verify;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class OrderServiceTest {
    @Mock
    StockService stockService=new StockService();
    @Mock
    PaymentService paymentService=new PaymentService();

//@Test
//    void placeolder() {
//
//    assertTrue(stockService.isAvailable("C001", 56));
//    assertFalse(!stockService.isAvailable("C002", 80));
//
//    assertTrue(paymentService.processPayment("C001", 54));
//    assertFalse(!paymentService.processPayment("C001", 54));
//
//    OrderService orderService=new OrderService(paymentService,stockService);
//    orderService.placeOrder("C002",67);
//
//
//
//
//}
}