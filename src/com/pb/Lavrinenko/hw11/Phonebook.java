package com.pb.Lavrinenko.hw11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Обеспечить следующий функционал:
 * - добавление элемента
 * - удаление элемента
 * - поиск элементов
 * - вывод всех записей с сортировкой по указанному полю (можно ограничиться двумя на выбор)
 * - редактирование элемента
 * - запись в файл всех данных
 * - загрузка из файла всех данных
 */

public class Phonebook {
    private static List<Record> recordList = new ArrayList<>();
    private static final String FILE_NAME = "save.dat";

    public static void addRecord(Record record) {
        recordList.add(record);
    }

    public static Record getRecordByIndex(int index) throws NoFindRecordException {
        if (index < 0) {
            String msg = String.format("Can`t find record by index: %s", index);
            throw new NoFindRecordException(msg);
        }
        return recordList.get(index);
    }

    public static Record getRecordByLastName(String lastName) throws NoFindRecordException {
        int index = searchRecordByLastName(lastName);
        if (index < 0) {
            String msg = String.format("Can`t find record by lastName: %s", lastName);
            throw new NoFindRecordException(msg);
        }
        return recordList.get(index);
    }

    public static Record getRecordByPhone(String phone) throws NoFindRecordException {
        int index = searchRecordByPhone(phone);
        if (index < 0) {
            String msg = String.format("Can`t find record by phone: %s", phone);
            throw new NoFindRecordException(msg);
        }
        return recordList.get(index);
    }

    public static int searchRecordByLastName(String lastName) {
        int len = recordList.size();
        for (int i = 0; i < len; i++) {
            Record resultRec = recordList.get(i);
            String resultRecLastName = resultRec.getLastName();
            if (resultRecLastName.equals(lastName)) {
                return i;
            }
        }
        return -1;
    }

    public static int searchRecordByPhone(String phone) {
        int len = recordList.size();
        for (int i = 0; i < len; i++) {
            Record resultRec = recordList.get(i);
            List<Phone> phoneList = resultRec.getPhoneList();
            int phoneListSize = phoneList.size();
            for (int j = 0; j < phoneListSize; j++) {
                String recPhone = phoneList.get(j).getPhone();
                if (recPhone.equals(phone)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void saveAllToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(recordList);
            System.out.println("Saved.... OK!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void loadAllFromFile() {
        List<Record> loadRecordList = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            loadRecordList = (List<Record>) ois.readObject();
            System.out.println("Loading... OK!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void print() {
        for (Record record :recordList) {
            System.out.println(record);
        }
    }
}
