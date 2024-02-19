package org.example.bank;

public class InsufficentBalanceException extends RuntimeException{

    private Account account;

    public InsufficentBalanceException() {
    }

    public InsufficentBalanceException(String message, Account account) {
        super(message);
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }
}
