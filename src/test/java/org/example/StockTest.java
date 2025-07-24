package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {
Stock stocker=new Stock(25);

@Test
    void retirer (){
        stocker.retirer(8);
        assertEquals(17,stocker.getQuantite());
        assertThrows(IllegalStateException.class,()-> stocker.retirer(30),"stock insuffisant");

    }

}