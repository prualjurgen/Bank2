package com.Bank;

public class Account {
    private long accountNumber;
    private double balance;
    private Currency currency;

    public Account(Currency currency) {
        this.balance = 0;
        this.accountNumber = 10000000 + (long) (Math.random() * 1000000L);
        this.currency = currency;
    }

    public void addMoney(double amountToAdd){
        this.balance += amountToAdd;

    }

    public void withdrawMoney(double amountOfMoney) {
        this.balance -= amountOfMoney;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                '}';
    }
}