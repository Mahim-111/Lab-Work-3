package controller;

import Constant.Constant;

/**
 * A Bank account that can be changed by
 * deposit and withdraw method.
 */
public class BankAccount {
    private double balance;
    public BankAccount() {
        balance = Constant.ZERO;
    }
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    /**
     * This method will deposit money in the bank account.
     * @param amount
     */
    public void deposit(double amount) {
        balance = balance + amount;
    }

    /**
     * Withdraw money from the bank account.
     * @param amount
     * @return success or failure
     */
    public boolean withdraw(double amount) {
        if(balance < amount) {
            return false;
        }
        balance = balance - amount;
        return true;
    }

    /**
     * Gets the current balance of the bank account.
     * @return current balance.
     */
    public double getBalance() {
        return balance;
    }

    public double getInterest (double interestRate) {
        return   balance * interestRate / Constant.PERCENT;
    }

    public void transferTo(BankAccount account, double transferAmount){
        if(transferAmount <= balance){
            withdraw(transferAmount);
            account.deposit(transferAmount);
        }
    }
}
