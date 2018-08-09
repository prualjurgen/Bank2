package com.Bank;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<AccountHolder> accountHolders = new ArrayList();

    public Bank(String bankName) {
        this.bankName = bankName;
        this.accountHolders = new ArrayList<>();
    }

    public void addPrivate(String name) {

        accountHolders.add(new UserAccountHolder(name));

    }

    public void addBusiness(String name) {
        accountHolders.add(new Business(name));

    }

    public void addFund(String name) {
        accountHolders.add(new Fund(name));
    }

    public double usersBalance(String nameOnAccount){
        for (AccountHolder accountHolder : accountHolders){
            if(accountHolder.name.equals(nameOnAccount)){
                return accountHolder.getAccountsBalance();
            }
        }
        return -1;
    }

    public void printUser(String fullName) {
        for (AccountHolder accountHolder : accountHolders){
            if(accountHolder.name.equals(fullName)){
                System.out.println(accountHolder);
            }
        }
    }



    public void addMoneyToUser(String name, double amountToAdd) {
        for (AccountHolder accountHolder : accountHolders) {
            if (accountHolder.name.equals(name)) {
                accountHolder.addMoney(amountToAdd);
            }
        }
    }

    public void withdrawMoneyFromAccount(String name, double amountOfMoney) {
        for (AccountHolder accountHolder : accountHolders) {
            if (accountHolder.name.equals(name)) {
                accountHolder.withdrawMoney(amountOfMoney);
            }
        }
    }

    public String getBankName() {
        return bankName;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", accountHolders=" + accountHolders +
                '}';
    }
}