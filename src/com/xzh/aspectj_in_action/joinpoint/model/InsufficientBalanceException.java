package com.xzh.aspectj_in_action.joinpoint.model;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
