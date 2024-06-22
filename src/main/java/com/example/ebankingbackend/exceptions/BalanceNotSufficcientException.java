package com.example.ebankingbackend.exceptions;

public class BalanceNotSufficcientException extends Exception {
    public BalanceNotSufficcientException(String message) {
        super(message);
    }
}
