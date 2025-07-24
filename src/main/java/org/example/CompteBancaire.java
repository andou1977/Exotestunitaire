package org.example;

public class CompteBancaire {
    private double solde = 0;

    public void deposer(double montant) {
        solde += montant;
    }

    public void retirer(double montant) {
        if (montant > solde) throw new IllegalArgumentException("Fonds insuffisants");
        solde -= montant;
    }

    public double getSolde() {
        return solde;
    }


}
