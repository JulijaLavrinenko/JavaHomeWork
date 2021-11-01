package com.pb.Lavrinenko.hw5;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Ветер", "Савронова Л.Е.", 2015);
        Book book2 = new Book("Ветер восточный", "Савронова Л.Е.", 2016);
        Book book3 = new Book("Штиль", "Савронова Л.Е.", 2018);

        System.out.println("Книги в библиотеке:");
        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());
        System.out.println(book3.getInfo());

        Reader reader1 = new Reader("Каркачев В.А.", 5, "ГРФ", "05.10.2004", "0503156412");
        Reader reader2 = new Reader("Власенко Т.А.", 15, "ЭТФ", "08.12.2005", "0503156415");
        Reader reader3 = new Reader("Мерат В.П.", 25, "МРФ", "25.10.2003", "0676111112");

        System.out.println("Читатели:");
        System.out.println(reader1.getInfo());
        System.out.println(reader2.getInfo());
        System.out.println(reader3.getInfo());

        reader1.takeBook(3);
        reader2.takeBook(book1.getNameBook(), book2.getNameBook());
        reader3.takeBook(book1, book2, book3);

        reader1.returnBook(2);
        reader2.returnBook(book1.getNameBook(), book2.getNameBook(), book3.getNameBook());
        reader3.returnBook(book1, book2);

    }
}
