package org.example.Enterprise;

public class BankTransferService {

    public void transfer(BankAccount from, BankAccount to, double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Montant invalide");
        from.withdraw(amount);
        to.deposit(amount);
    }
}
