package org.example.Facture;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class FactureServiceTest {

    @Test
    void calculerRemise(){
        ClientRepository clientRepository=mock(ClientRepository.class);
        when(clientRepository.findById("01")).thenReturn(new Client("01","andou",true));

        FactureService factureService=new FactureService(clientRepository);
        assertEquals(0.1,factureService.calculerRemise("01"));
    }
}