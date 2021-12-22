package com.pb.Lavrinenko.hw12;
import com.pb.Lavrinenko.hw11.NoFindRecordException;

public class DemoAppStreams {
    public static void main(String[] args) throws NoFindRecordException {
        Phonebook phonebook = new Phonebook();
        Phone phone = new Phone("+3 8067-123-4567");
        Record record1 = Record.newBuilder()
                .setAddress("village of Small Gniltsi, Kuzyukin region")
                .setDob(1982, 12, 22)
                .setLastName("Smith")
                .setPhone(phone)
                .setFirstName("Vasya")
                .build();

        Record record2 = Record.newBuilder()
                .setLastName("Franklin")
                .setFirstName("Ben")
                .setDob(1706,1,17)
                .setAddress("Philadelphia")
                .setPhone(new Phone("+3 8099-765-4321"))
                .setPhone(new Phone("+3 8097-555-3311"))
                .build();

        Record record3 = Record.newBuilder()
                .setLastName("Van Damme")
                .setFirstName("Jean-Claude Kamil Fransua")
                .setDob(1960,10,18)
                .setAddress("Belgium")
                .setPhone(new Phone("+7 0614-44-3311"))
                .setPhone(new Phone("+7 0615-55-8822"))
                .build();

        Phonebook.addRecord(record1);
        Phonebook.addRecord(record2);
        Phonebook.addRecord(record3);

        phonebook.print();

        System.out.println("---Record by Index");
        Record record = Phonebook.getRecordByIndex(0);
        System.out.println(record);

        System.out.println("---Record by Last Name (Stream)");
        Phonebook.searchRecordByLastName("Franklin");

        System.out.println("---Record by Phone (Stream)");
        Phonebook.searchRecordByPhone("+7 0615-55-8822");

        System.out.println("---Save records to file");
        Phonebook.saveAllToFile();

        System.out.println("---Load records from file");
        Phonebook.loadAllFromFile();

        System.out.println("---print first 2 elements (Stream)");
        Phonebook.printFirstNElements(2);
    }
}
