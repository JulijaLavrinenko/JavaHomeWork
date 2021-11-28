package com.pb.Lavrinenko.hw10;

public class Main {
    public static void main(String[] args) throws NumBox.SizeException {

        NumBox<Integer> intNumBoxBox = new NumBox<>(4);
        intNumBoxBox.add(1);
        intNumBoxBox.add(2);
        intNumBoxBox.add(3);
        intNumBoxBox.add(4);

        System.out.println("Массив чисел типа int: " );
        System.out.println("Количество элементов: " + intNumBoxBox.length());
        System.out.println("Сумма всех элементов: " + intNumBoxBox.sum());
        System.out.println("Среднее значение: " + intNumBoxBox.average());
        System.out.println("Максимум: " + intNumBoxBox.max());
        System.out.println("Первый элемент: " + intNumBoxBox.get(0));
        intNumBoxBox.printNum();

        System.out.println("---------------------------------" );

        NumBox<Float> floatNumBoxBox = new NumBox<>(6);
        floatNumBoxBox.add(14.5F);
        floatNumBoxBox.add(24F);
        floatNumBoxBox.add(15F);
        floatNumBoxBox.add(2F);

        System.out.println("Массив чисел типа float: " );
        System.out.println("Количество элементов: " + floatNumBoxBox.length());
        System.out.println("Сумма всех элементов: " + floatNumBoxBox.sum());
        System.out.println("Среднее значение: " + floatNumBoxBox.average());
        System.out.println("Максимум: " + floatNumBoxBox.max());
        System.out.println("Первый элемент: " + floatNumBoxBox.get(0));
        floatNumBoxBox.printNum();

        System.out.println("---------------------------------" );
        System.out.println("Работа исключения:" );
        floatNumBoxBox.add(15F);
        floatNumBoxBox.add(2F);
        floatNumBoxBox.add(2F);
    }
}
