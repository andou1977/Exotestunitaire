package org.example.Ecommerce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void reducestocksuffisant() {
        Product product = new Product("andou", 56.45, 400);
        product.reduceStock(200);
        assertEquals(200, product.getStock());
    }

    @Test
    void reducestockinsuffisant() {
        Product product = new Product("andou", 56.45, 400);
        assertThrows(IllegalArgumentException.class, () -> product.reduceStock(500));
    }


    @Test
    void addproduct(){
        Order order=new Order();
       order.addProduct(new Product("peter",65.56,600));
       assertEquals(1,order.getProducts().size());

    }

    @Test
    void calculetotal(){
        Order order=new Order();
        order.addProduct(new Product("andou",75.90,400));
        order.addProduct(new Product("peter",100.00,600));
        assertEquals(175.90,order.calculateTotal());
    }
}