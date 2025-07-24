package org.example;

public class Stock {

    private int quantite;

    public Stock(int initial) {
        if (initial < 0) throw new IllegalArgumentException("Stock initial négatif");
        this.quantite = initial;
    }

    public void retirer(int qte) {
        if (qte > quantite) throw new IllegalStateException("Stock insuffisant");
        quantite -= qte;
    }

    public int getQuantite() {
        return quantite;
    }
}



