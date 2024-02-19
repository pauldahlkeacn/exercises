package org.example.bank;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private long balance;

    public Account() {
        this(0);
    }

    public Account(long balance) {
        this.balance = balance;
    }

    void withdraw(long amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Please do not try to withdraw negative negative amount money");
        }
        if (amount > balance) {
            throw new InsufficentBalanceException("Your balance is not sufficient", this);
        }

//        if (balance - amount > balance) {
//            throw new IllegalArgumentException("Underflow detected");
//        }

        this.balance -= amount;
    }

    void deposit(long amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Please only deposit non negative amounts money");
        }

        if (balance + amount < balance) {
            throw new IllegalArgumentException("Overflow detected!");
        }

        this.balance += amount;
    }
}
