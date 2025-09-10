package org.example;

import app.getxray.xray.junit.customjunitxml.annotations.XrayTest;
import org.example.Facture.MyClient;

import java.util.List;

public class FirstUnitTest {
    @XrayTest(key = "EN-7")
    public  boolean estMajeur(int age) {

        return age >= 18;
    }



@XrayTest(key = "EN-7")
        public static boolean isValidDate(int day, int month, int year) {
            if (year < 1900 || year > 2100) return false;
            if (month < 1 || month > 12) return false;
            if (day < 1 || day > 31) return false;
            if (month == 2) {
                boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                return day <= (leap ? 29 : 28);
             }
            if (month == 4 || month == 6 || month == 9 || month == 11)
                return day <= 30;
            return true;
        }

    @XrayTest(key = "EN-7")

    public double calculerSalaireNet(double brut, double tauxCotisation) {
        if (brut < 0 || tauxCotisation < 0 || tauxCotisation > 1) {
            throw new IllegalArgumentException("Paramètres invalides");
        }
        return brut * (1 - tauxCotisation);
    }
    @XrayTest(key = "EN-7")
    public double calculerTVA(double montantHT, double tauxTVA) {
        return montantHT * tauxTVA;
    }


    @XrayTest(key = "EN-7")
    public boolean estEmailValide(String email) {
        return email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    }

    @XrayTest(key = "EN-7")
    public boolean estMotDePasseValide(String motDePasse) {
        return motDePasse.length() >= 8 && motDePasse.matches(".*\\d.*") && motDePasse.matches(".*[A-Z].*");
    }
    @XrayTest(key = "EN-7")

    public boolean estEligible(int age, boolean aRevenuStable) {
        return age >= 18 && aRevenuStable;
    }

    @XrayTest(key = "EN-7")
    public boolean MYestEligible(MyClient client) {
        return client.getAge() >= 18 &&
                client.getRevenusAnnuel() > 20000 &&
                client.getNombreIncidents() == 0 &&
                client.getPays().equalsIgnoreCase("FR");
    }


    @XrayTest(key = "EN-7")
    public double withdraw(double balance, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (amount > balance) {
            throw new RuntimeException("Insufficient balance");
        }
        return balance - amount;
    }

    @XrayTest(key = "EN-7")
    public double calculateTotal(List<Double> items, double taxRate, double discount) {
        if (items == null || items.isEmpty()) {
            throw new IllegalArgumentException("Items cannot be empty");
        }
        double subtotal = items.stream().mapToDouble(Double::doubleValue).sum();
        double tax = subtotal * taxRate;
        double total = subtotal + tax - discount;
        return total < 0 ? 0 : total;
    }

}



