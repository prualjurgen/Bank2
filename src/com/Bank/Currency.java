package com.Bank;

public enum Currency {
    EUR("eur") , GBP("gbp") , USD("usd");

    String currency;

    Currency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return currency;
    }
}