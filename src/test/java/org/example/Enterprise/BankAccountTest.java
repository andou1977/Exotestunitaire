package org.example.Enterprise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void positifmontant(){
        BankAccount bankAccount=new BankAccount("001",456);
        bankAccount.deposit(100);
        assertEquals(556,bankAccount.getBalance());
    }
    @Test
    void montantnegatif(){
        BankAccount bankAccount=new BankAccount("002",500);
        assertThrows(IllegalArgumentException.class,()-> bankAccount.deposit((-45)));
    }

    @Test
    void withdraw(){
        BankAccount bankAccount=new BankAccount("002",650);
        bankAccount.withdraw(400);
        assertEquals(250,bankAccount.getBalance());
    }
    @Test
    void negatifmontant(){
        BankAccount bankAccount=new BankAccount("002",650);

        assertThrows(IllegalArgumentException.class,()-> bankAccount.deposit((-6)));
    }

}