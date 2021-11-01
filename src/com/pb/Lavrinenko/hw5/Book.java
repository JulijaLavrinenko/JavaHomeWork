package com.pb.Lavrinenko.hw5;

public class Book {

    private String nameBook;
    private String nameAvtor;
    private int year;


    public Book() {
    }

    public Book(String nameBook, String nameAvtor, int year) {
        this.nameBook = nameBook;
        this.nameAvtor = nameAvtor;
        this.year = year;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getNameAvtor() {
        return nameAvtor;
    }
    public int getYear() {
        return year;
    }

    public String getInfo() {
        return  nameBook + " (" + nameAvtor + " " + year  + " г.)";
    }
}
