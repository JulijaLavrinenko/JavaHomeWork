package com.pb.Lavrinenko.hw12;

import com.pb.Lavrinenko.hw11.InvalidPhoneNumberException;

import java.io.Serializable;

public class Phone implements Serializable {
    private static final String REGEX_PHONE =
            "^\\+?[\\d\\s]+(\\-([\\d\\s]|[\\s]*(\\([\\d]+\\)[\\s]*))+)+$";
    private String phone;

    public Phone(String phone) {
        try {
            validatorNumber(phone);
            this.phone = phone;
        } catch (InvalidPhoneNumberException e) {
            e.printStackTrace();
        }

    }

    private static void validatorNumber(String phone) throws InvalidPhoneNumberException {
        boolean result = phone.matches(REGEX_PHONE);
        if (!result) {
            String msg = String.format("Invalid phone number: %s", phone);
            throw new InvalidPhoneNumberException(msg);
        }
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "phone = " + phone;
    }

}