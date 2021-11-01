package com.pb.Lavrinenko.hw5;

public class Reader {

    private String nameReader;
    private int numKvytok;
    private String nameFakultet;
    private String dateBirthday;
    private String numPhone;

    public Reader() {
    }

    public Reader( String nameReader, int numKvytok, String nameFakultet, String dateBirthday, String numPhone) {

        this.nameReader = nameReader;
        this.numKvytok = numKvytok;
        this.nameFakultet = nameFakultet;
        this.dateBirthday= dateBirthday;
        this.numPhone =numPhone;

    }

    public String getInfo() {
        return nameReader + ", номер читательского: " + numKvytok + ", факультет: " + nameFakultet + ", дата народження: "
                + dateBirthday + ", телефон: " + numPhone + ".";
    }

    public void takeBook(int colBook) {
      System.out.println(this.nameReader + " взял книг: " + colBook+ " шт.");
    }


    public void takeBook(String... books) {

        System.out.print(this.nameReader + " взял книги: ");
        int i = 1;
        for (String  oneBook: books) {
            System.out.print(oneBook);

            if ( i != books.length){
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
            i = i+1;
        }
    }

    public void takeBook(Book... books) {

        System.out.print(this.nameReader + " взял книги: ");
        int i = 1;
        for (Book oneBook: books) {
            System.out.print(oneBook.getInfo());

            if ( i != books.length){
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
            i = i+1;
        }
    }

    public void returnBook(int colBook) {
        System.out.println(this.nameReader + " вернул книг: " + colBook+ " шт.");
    }


    public void returnBook(String... books) {

        System.out.print(this.nameReader + " вернул книги: ");
        int i = 1;
        for (String  oneBook: books) {
            System.out.print(oneBook);

            if ( i != books.length){
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
            i = i+1;
        }
    }

    public void returnBook(Book... books) {

        System.out.print(this.nameReader + " вернул книги: ");
        int i = 1;
        for (Book oneBook: books) {
            System.out.print(oneBook.getInfo());

            if ( i != books.length){
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
            i = i+1;
        }
    }


}
