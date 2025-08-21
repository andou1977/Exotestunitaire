package org.example;

import app.getxray.xray.junit.customjunitxml.annotations.XrayTest;
import org.example.Enumeration.StatutCommande;
import org.example.Enumeration.StatutCommandeUtil;
import org.example.Facture.Client;
import org.example.Facture.MyClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

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


 @Test()
 void myeligible(){
    assertFalse(firstUnitTest.MYestEligible(new MyClient(18,25000,0,"BE")));
assertTrue(firstUnitTest.MYestEligible(new MyClient(18,25000,0,"FR")));
 }
    @XrayTest(key = "TEST-123")
 @Test
 void statuscommandeutil(){
     // MYF-14 : Vérifier que la connexion fonctionne
        assertEquals("Commande en cours",StatutCommandeUtil.getLibelle(StatutCommande.EN_COURS));
        assertEquals("Commande expédiée",StatutCommandeUtil.getLibelle(StatutCommande.EXPEDIEE));
        assertEquals("Commande annulée",StatutCommandeUtil.getLibelle(StatutCommande.ANNULEE));

        assertThrows(IllegalArgumentException.class,()->StatutCommandeUtil.getLibelle(StatutCommande.LIVREE));

 }


 @Test
 void withdraw(){
        assertThrows(IllegalArgumentException.class,()-> firstUnitTest.withdraw(-5,-7),"must be positive");
        assertThrows(RuntimeException.class, ()-> firstUnitTest.withdraw(45,50));
        assertEquals(5,firstUnitTest.withdraw(50,45));
 }


 @Test
    void calculatetotal() {
     assertThrows(IllegalArgumentException.class, () -> firstUnitTest.calculateTotal(Arrays.asList(), 55.65, 67.8));
     assertEquals(6326.158799999998, firstUnitTest.calculateTotal(Arrays.asList(56.4, 67.76), 50.68, 90.43));

     assertEquals(0.0, firstUnitTest.calculateTotal(Arrays.asList(0.0, 0.0), 0.0, 0.0));

 }
}