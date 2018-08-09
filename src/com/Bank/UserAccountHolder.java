package com.Bank;

import static com.Bank.Currency.EUR;

public class UserAccountHolder extends AccountHolder {

    public UserAccountHolder(String name) {
        this.name = name;
        this.account = new Account(EUR);
    }

    @Override
    public void withdrawMoney(double amountOfMoney) {
        this.account.withdrawMoney(amountOfMoney * 1.05);
    }

    @Override
    public void addMoney(double amountOfMoney) {
        this.account.addMoney(amountOfMoney);
    }

    @Override
    public String toString() {
        return "Private user account{" +
                "name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}