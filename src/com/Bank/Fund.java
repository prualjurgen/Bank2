package com.Bank;

import static com.Bank.Currency.EUR;

public class Fund extends AccountHolder {

    public Fund(String name) {
        this.name = name;
        this.account = new Account(EUR);
    }

    @Override
    public void addMoney(double amountOfMoney) {
        this.account.addMoney(amountOfMoney);
    }

    @Override
    public void withdrawMoney(double amountOfMoney) {
        this.account.withdrawMoney(amountOfMoney);
    }

    @Override
    public String toString() {
        return "Fund user account{" +
                "name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}