package org.example.Enterprise;

public class BankAccount {

    private String iban;
    private double balance;

    public BankAccount(String iban, double initialBalance) {
        this.iban = iban;
        this.balance = initialBalance;
    }

    public String getIban() { return iban; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Montant invalide");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) throw new IllegalStateException("Fonds insuffisants");
        balance -= amount;
    }
}
