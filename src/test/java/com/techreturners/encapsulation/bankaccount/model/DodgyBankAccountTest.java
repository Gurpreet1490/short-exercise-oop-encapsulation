package com.techreturners.encapsulation.bankaccount.model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DodgyBankAccountTest {

    @Test
    public void checkDogdyBankAccountReward(){
        DodgyBankAccount dodgyBankAccount = new DodgyBankAccount("ABCDEF3536");
        int Expected = 50;
        assertEquals(Expected, dodgyBankAccount.rewardAmount);
    }

    @Test
    public void checkDogdyBankAccountBalance(){
        DodgyBankAccount dodgyBankAccount = new DodgyBankAccount("ABCDEF3536");
        assertEquals(0, dodgyBankAccount.accountBalance);
    }

    @Test
    public void checkDogdyBankAccountDeposit(){
        DodgyBankAccount dodgyBankAccount = new DodgyBankAccount("ABCDEF3536");

        int expBalance= 80;
        dodgyBankAccount.depositAmount(30);

        assertEquals(expBalance, dodgyBankAccount.getAccountBalance());
    }


}
