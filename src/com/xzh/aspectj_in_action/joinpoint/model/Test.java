package com.xzh.aspectj_in_action.joinpoint.model;

public class Test {
    public static void main(String[] args) throws InsufficientBalanceException{
        SavingAccount account=new SavingAccount(123456);
        account.credit(100);
        account.debit(50);
    }
}
