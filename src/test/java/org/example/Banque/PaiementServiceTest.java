package org.example.Banque;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaiementServiceTest {
BanqueClientService banqueClientService;
PaiementService paiementService=new PaiementService(new BanqueClientService() {
    @Override
    public double getSolde(String clientId) {
        return 1000;
    }

    @Override
    public void debiter(String clientId, double montant) {

    }
});

@Test
    void effectuerpaiement(){
    assertTrue(paiementService.effectuerPaiement("C001",450));
    assertFalse(paiementService.effectuerPaiement("C002",2000));
}



}