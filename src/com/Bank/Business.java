package com.Bank;

import static com.Bank.Currency.EUR;

public class Business extends AccountHolder {

    public Business(String name) {
        this.name = name;
        this.account = new Account(EUR);
    }

    @Override
    public void addMoney(double amountOfMoney) {
        this.account.addMoney(amountOfMoney);
    }

    @Override
    public void withdrawMoney(double amountOfMoney) {
        this.account.withdrawMoney(amountOfMoney * 1.03);
    }

    @Override
    public String toString() {
        return "Business user account{" +
                "name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}