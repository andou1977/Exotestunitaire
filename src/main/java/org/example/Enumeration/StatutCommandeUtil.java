package org.example.Enumeration;

public class StatutCommandeUtil {
    public static String getLibelle(StatutCommande statut) {
        switch (statut) {
            case EN_COURS: return "Commande en cours";
            case EXPEDIEE: return "Commande expédiée";
            case ANNULEE: return "Commande annulée";
            default: throw new IllegalArgumentException("Statut inconnu");
        }
    }
}
