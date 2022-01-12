package com.techreturners.encapsulation.bankaccount.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SecureBankAccountTest {

    @Test
    public void checkSecureBankAccountDeposit(){
        SecureBankAccount secureBankAccount = new SecureBankAccount("ABCDEF3536");

        int expBalance= 80;
        secureBankAccount.depositAmount(30);

        assertEquals(expBalance, secureBankAccount.displayAccountBalance());
    }
}
