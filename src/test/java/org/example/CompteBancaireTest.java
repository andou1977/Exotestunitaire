package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompteBancaireTest {

    CompteBancaire compteBancaire;
    @BeforeEach
    void setup(){
        compteBancaire=new CompteBancaire();
    }
    @Test
    void deposer(){
 compteBancaire.deposer(100);
        Assertions.assertEquals(100,compteBancaire.getSolde());

    }
    @Test
    void retirer(){
        compteBancaire.deposer(500);
        compteBancaire.retirer(200);

        Assertions.assertEquals(300,compteBancaire.getSolde());
        Assertions.assertThrows(IllegalArgumentException.class,()->compteBancaire.retirer(5000));
    }

}