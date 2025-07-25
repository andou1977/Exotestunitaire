package org.example.Facture;

public class Client {

    private String id;
    private String nom;
    private boolean fidele;

    public Client(String id, String nom, boolean fidele) {
        this.id = id;
        this.nom = nom;
        this.fidele = fidele;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public boolean isFidele() {
        return fidele;
    }
}
