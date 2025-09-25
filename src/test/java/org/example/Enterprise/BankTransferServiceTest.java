package org.example.Enterprise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTransferServiceTest {
    @Test
    void transfert(){
        BankTransferService bankTransferService=new BankTransferService();
        BankAccount banckfrom=new BankAccount("001",500);
        BankAccount banckto=new BankAccount("002",600);

        bankTransferService.transfer(banckfrom,banckto,500);
        assertEquals(1100,banckto.getBalance());

    }


    @Test
    void transfertexception(){
        BankTransferService bankTransferService=new BankTransferService();
        BankAccount banckfrom=new BankAccount("001",500);
        BankAccount banckto=new BankAccount("002",600);
        assertThrows(IllegalArgumentException.class,()->bankTransferService.transfer(banckfrom,banckto,-67));
    }

}