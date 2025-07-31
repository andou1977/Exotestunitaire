package org.example;

import org.example.Facture.MyClient;

public class FirstUnitTest {

    public  boolean estMajeur(int age) {

        return age >= 18;
    }




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



    public double calculerSalaireNet(double brut, double tauxCotisation) {
        if (brut < 0 || tauxCotisation < 0 || tauxCotisation > 1) {
            throw new IllegalArgumentException("Paramètres invalides");
        }
        return brut * (1 - tauxCotisation);
    }

    public double calculerTVA(double montantHT, double tauxTVA) {
        return montantHT * tauxTVA;
    }



    public boolean estEmailValide(String email) {
        return email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    }


    public boolean estMotDePasseValide(String motDePasse) {
        return motDePasse.length() >= 8 && motDePasse.matches(".*\\d.*") && motDePasse.matches(".*[A-Z].*");
    }


    public boolean estEligible(int age, boolean aRevenuStable) {
        return age >= 18 && aRevenuStable;
    }


    public boolean estEligible(MyClient client) {
        return client.getAge() >= 18 &&
                client.getRevenusAnnuel() > 20000 &&
                client.getNombreIncidents() == 0 &&
                client.getPays().equalsIgnoreCase("FR");
    }

}



