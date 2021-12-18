package com.pb.Lavrinenko.hw11;

public class InvalidPhoneNumberException extends Exception{
    private String message;

    public InvalidPhoneNumberException(String message) {
        this.message = message;
    }
}
