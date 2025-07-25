package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class FirstUnitTestTest {

    FirstUnitTest firstUnitTest=new FirstUnitTest();
    @Test
    void inverser(){

        assertTrue(firstUnitTest.estMajeur(25));
        assertTrue(firstUnitTest.estMajeur(18));
        assertFalse(firstUnitTest.estMajeur(17));

    }


    @Test
    void validateDate(){
       assertFalse (FirstUnitTest.isValidDate(10,5,1899));
       assertFalse(FirstUnitTest.isValidDate(20,1,1890));
        assertFalse(FirstUnitTest.isValidDate(25,10,1895));
        assertTrue(FirstUnitTest.isValidDate(29, 2, 2024));
    }



    @Test
    void calculersalairenet(){
        assertThrows(IllegalArgumentException.class,()-> firstUnitTest.calculerSalaireNet(-1,2));
        assertThrows(IllegalArgumentException.class,()-> firstUnitTest.calculerSalaireNet(-5,-1));
        assertThrows(IllegalArgumentException.class,()-> firstUnitTest.calculerSalaireNet(-7,2));
        assertEquals(45,firstUnitTest.calculerSalaireNet(45,0));

    }

    @Test
    void CalculTva(){
        assertEquals(35.00,firstUnitTest.calculerTVA(7.00,5.00 ));
    }

 @Test
    void emailvalide(){
        assertTrue(firstUnitTest.estEmailValide("andouemmanuel@gmail.com"));
        assertFalse(firstUnitTest.estEmailValide("bb@gmai"));
 }

 @Test
    void motpassevalide(){

assertTrue(firstUnitTest.estMotDePasseValide("manuollo1565#2343V"));
     assertFalse(firstUnitTest.estMotDePasseValide("andou"));
 }

    @Test
    void esteligible(){
        assertTrue(firstUnitTest.estEligible(25,true));
        assertFalse(firstUnitTest.estEligible(17,false));

 }
}