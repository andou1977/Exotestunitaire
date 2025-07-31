package org.example.Banque;

public class PaiementService {

    private final BanqueClientService banqueService;

    public PaiementService(BanqueClientService banqueService) {
        this.banqueService = banqueService;
    }

    public boolean effectuerPaiement(String clientId, double montant) {
        double solde = banqueService.getSolde(clientId);
        if (solde >= montant) {
            banqueService.debiter(clientId, montant);
            return true;
        }
        return false;
    }
}
