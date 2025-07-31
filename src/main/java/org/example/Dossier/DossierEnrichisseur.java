package org.example.Dossier;

public class DossierEnrichisseur {

    private final ProfilClientService profilService;

    public DossierEnrichisseur(ProfilClientService profilService) {
        this.profilService = profilService;
    }

    public void enrichir(Dossier dossier) {
        Profil profil = profilService.recupererProfil(dossier.getClientId());
        dossier.setCategorieClient(profil.getCategorie());
        if ("VIP".equals(profil.getCategorie())) {
            dossier.setPrioritaire(true);
        }
    }
}
