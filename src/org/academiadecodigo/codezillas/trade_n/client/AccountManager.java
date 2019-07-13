package org.academiadecodigo.codezillas.trade_n.client;

import org.academiadecodigo.codezillas.trade_n.currency.CurrencyType;

import java.util.HashSet;

public class AccountManager {

    private HashSet<Account> accounts;

    public AccountManager() {

        accounts = new HashSet<>();
    }

    public void makeAccount(CurrencyType currencyType) {
        Account account = new Account(currencyType);
        accounts.add(account);
    }

    public HashSet<Account> getAccounts() {
        return accounts;
    }

    public void deposit(int accountID, int amount) {
        for (Account acc : accounts) {
            if (acc.getId() == accountID) {
                acc.deposit(amount);
            }
        }
    }

    public void transfer(int accountID, int amount) {
        for (Account acc : accounts) {
            if (acc.getId() == accountID) {
                acc.transfer(amount);
            }
        }
    }
}
