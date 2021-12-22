package com.pb.Lavrinenko.hw12;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Record implements Serializable {
    private String firstName;
    private String lastName;
    private LocalDate doB;
    private List<Phone> phoneList = new ArrayList<>();
    private String address;
    private LocalDate datetimeEdit;

    private Record() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDoB() {
        return doB;
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getDatetimeEdit() {
        return datetimeEdit;
    }

    public static Builder newBuilder() {
        return new Record().new Builder();
    }

    public String getPhoneByNumber(String phoneNumb) {
        return phoneList.stream()
                .filter(list -> list.getPhone().equals(phoneNumb))
                .map(rec -> rec.getPhone())
                .limit(1)
                .collect(Collectors.joining());
    }

    @Override
    public String toString() {
        return "Record{" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", doB = " + doB +
                ", phoneList = " + phoneList +
                ", address = '" + address + '\'' +
                ", datetimeEdit = " + datetimeEdit +
                '}';
    }

    public class Builder {

        private Builder() {
            setDatetimeEdit();
        }

        public Builder setFirstName(String firstName) {
            Record.this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            if (lastName == null) {
                throw new IllegalArgumentException("Parameter can`t be null");
            }
            Record.this.lastName = lastName;
            return this;
        }

        public Builder setDob(int year, int month, int dayOfMonth) {
            Record.this.doB = LocalDate.of(year, month, dayOfMonth);
            return this;
        }

        public Builder setPhoneList(List<Phone> phoneList) {
            Record.this.phoneList = phoneList;
            return this;
        }

        public Builder setPhone(Phone phone) {
            phoneList.add(phone);
            return this;
        }

        public Builder setAddress(String address) {
            Record.this.address = address;
            return this;
        }

        private void setDatetimeEdit() {
            Record.this.datetimeEdit = LocalDate.now();
        }

        public Record build() {
            return Record.this;
        }

    }
}
