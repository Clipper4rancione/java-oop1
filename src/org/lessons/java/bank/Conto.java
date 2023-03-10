package org.lessons.java.bank;

import java.util.Random;

public class Conto {

    private int accountNumber;
    private String userName;
    private double balance;

    public Conto(String userName){
        this.userName = userName;
        Random random = new Random();
        accountNumber = random.nextInt(1, 1000);
        balance = 0.0;
    }

    // GETTERS


    public int getAccountNumber() {
        return accountNumber;
    }

    public String getUserName() {
        return userName;
    }

    public double getBalance() {
        return balance;
    }

    // SETTER


    public void setUserName(String userName) {
        this.userName = userName;
    }
}
