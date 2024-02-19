package org.example.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<Account> accounts;

    public Bank(List<Account> accounts) {
        this.accounts = accounts;
    }

    public Account createAccount(long balance) {
        Account account = new Account(balance);
        this.accounts.add(account);
        return account;
    }

    public static void main(String[] args) {
        Bank b = new Bank(new ArrayList<>());
        Account a = b.createAccount(2000);
        try {
            a.withdraw(2001);
        } catch (InsufficentBalanceException e){
            System.out.println(e.getAccount());
        }

    }
}
