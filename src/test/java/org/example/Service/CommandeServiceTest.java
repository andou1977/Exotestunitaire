package org.example.Service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CommandeServiceTest {


    @Test
    void traiterCommande(){
   StockService stockService=mock(StockService.class);
   PaiementService paiementService=mock(PaiementService.class);
   when(stockService.estDisponible("C001",900)).thenReturn(true);
  CommandeService commandeService=new CommandeService(stockService,paiementService);
  boolean resultat= commandeService.traiterCommande("C001",900);

 assertTrue(resultat);

   }
    @Test
    void nktraiterCommande(){
        StockService stockService=mock(StockService.class);
        PaiementService paiementService=mock(PaiementService.class);
        when(stockService.estDisponible("C002",1900)).thenReturn(true);
        CommandeService commandeService=new CommandeService(stockService,paiementService);
        boolean resultat= commandeService.traiterCommande("C0013",2900);

        assertFalse(resultat);

    }

    }

