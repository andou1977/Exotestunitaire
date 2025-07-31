package org.example.Facture;

public class MyClient {

    private int age;
    private double revenusAnnuel;
    private int nombreIncidents;
    private String pays;

    public MyClient(int age, double revenusAnnuel, int nombreIncidents, String pays) {
        this.age = age;
        this.revenusAnnuel = revenusAnnuel;
        this.nombreIncidents = nombreIncidents;
        this.pays = pays;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRevenusAnnuel() {
        return revenusAnnuel;
    }

    public void setRevenusAnnuel(double revenusAnnuel) {
        this.revenusAnnuel = revenusAnnuel;
    }

    public int getNombreIncidents() {
        return nombreIncidents;
    }

    public void setNombreIncidents(int nombreIncidents) {
        this.nombreIncidents = nombreIncidents;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }


    public boolean estEligible(MyClient   client) {
        return client.getAge() >= 18 &&
                client.getRevenusAnnuel() > 20000 &&
                client.getNombreIncidents() == 0 &&
                client.getPays().equalsIgnoreCase("FR");
    }

}
