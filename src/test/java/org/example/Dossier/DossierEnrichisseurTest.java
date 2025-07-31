package org.example.Dossier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DossierEnrichisseurTest {
   DossierEnrichisseur dossierEnrichisseur=new DossierEnrichisseur(new ProfilClientService() {
       @Override
       public Profil recupererProfil(String clientId) {
           return null;
       }
   });
   Dossier dossier=new Dossier("C001");
   Profil profil=new Profil("VIP");
    @Test
    void dossierenrichissant(){

      assertEquals("VIP",profil.getCategorie());
    }


}