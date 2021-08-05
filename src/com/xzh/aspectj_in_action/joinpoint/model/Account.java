package com.xzh.aspectj_in_action.joinpoint.model;

import javax.naming.InsufficientResourcesException;

public abstract class Account {
    private float balance;
    private int accountNumber;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * 存钱
     * @param amount
     */
    public void credit(float amount){
        setBalance(getBalance()+amount);
    }

    /**
     * 取钱
     * @param amount
     * @throws InsufficientBalanceException
     */
    public void debit(float amount)throws InsufficientBalanceException{
        float balance = getBalance();
        if (balance<amount){
            throw new InsufficientBalanceException("Total balance not sufficient");
        }else {
            setBalance(balance-amount);
        }
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
