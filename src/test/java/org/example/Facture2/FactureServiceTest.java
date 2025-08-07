package org.example.Facture2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class FactureServiceTest {

    @Test

    void calculeremise(){
        ClientRepository clientRepository=mock(ClientRepository.class);
        when(clientRepository.findById("COO2")).thenReturn(new Client(true));
        when(clientRepository.findById("COO3")).thenReturn(new Client(false));
        FactureService factureService=new FactureService(clientRepository);
        FactureService factureService2=new FactureService(clientRepository);
        assertThrows(IllegalArgumentException.class,()->factureService.calculerRemise("Client introuvable"));
        assertEquals(0.1,factureService.calculerRemise("COO2"));
        assertEquals(0.0,factureService2.calculerRemise("COO3"));

    }



}