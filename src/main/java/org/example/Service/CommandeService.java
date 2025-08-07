package org.example.Service;

public class CommandeService {
    private final StockService stockService;
    private final PaiementService paiementService;

    public CommandeService(StockService stockService, PaiementService paiementService) {
        this.stockService = stockService;
        this.paiementService = paiementService;
    }

    public boolean traiterCommande(String produitId, int quantite) {
        if (!stockService.estDisponible(produitId, quantite)) {
            return false;
        }
        paiementService.effectuerPaiement(produitId, quantite);
        return true;
    }
}

