package org.example.Dossier;

public class Dossier {

    private String clientId;
    private String categorieClient;
    private boolean prioritaire;

    public Dossier(String clientId) {
        this.clientId = clientId;
    }

    public String getClientId() { return clientId; }
    public String getCategorieClient() { return categorieClient; }
    public boolean isPrioritaire() { return prioritaire; }

    public void setCategorieClient(String categorieClient) {
        this.categorieClient = categorieClient;
    }

    public void setPrioritaire(boolean prioritaire) {
        this.prioritaire = prioritaire;
    }
}
