package org.example.Facture;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyClientTest {

    MyClient myClient=new MyClient(25,30000,10,"FR");

@Test
    void esteligible(){
    assertTrue(myClient.estEligible(new MyClient(25,30000,0,"FR")));
    assertFalse(myClient.estEligible(new MyClient(25,30000,0,"FI")));
}
}