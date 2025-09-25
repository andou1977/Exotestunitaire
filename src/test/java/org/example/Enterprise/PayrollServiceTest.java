package org.example.Enterprise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayrollServiceTest {
PayrollService payrollService=new PayrollService();




    @Test
    void  calculatemanager(){
        Employee manager=new Employee("001","Andou",45000.45,"MANAGER");
double manager1= payrollService.calculateBonus(manager);
assertEquals(9000.09,manager1);
    }

    @Test
  void calculatedev() {
        Employee dev=new Employee("002","Peter",5000,"DEV");
        double dev1= payrollService.calculateBonus(dev);
        assertEquals(500,dev1);
    }


    @Test
    void calculatetester(){
        Employee tester=new Employee("003","Alexandra",4500,"TESTER");
        double tester1= payrollService.calculateBonus(tester);
        assertEquals(225,tester1);
    }

    @Test
    void exception(){
        Employee inconnu=new Employee("004","jhonny",3450,"");

        assertThrows(IllegalArgumentException.class,()-> payrollService.calculateBonus(inconnu));
    }

    @Test
    void calculatesakary(){
        Employee tester=new Employee("003","Alexandra",4500,"TESTER");
        assertEquals(4725,payrollService.calculateTotalSalary(tester));
    }

}