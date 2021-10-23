package com.pb.Lavrinenko.hw3;
import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {

        int[] array = new int[10];

        // Заполнение массива.
        for (int i = 0; i < array.length; i++) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите " + (i+1) + " элемент массива: ");
            if (in.hasNextInt()) {
                array[i] = in.nextInt();
            } else {
                System.out.println("Ошибка. Введите целое число.");
                i--;
            }
            }

        // Вывод на экран значений элементов массива.
        System.out.print("Итак наш массив: { ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("}");
        System.out.println("Или так: " + Arrays.toString(array));

        // Подсчет суммы элементов
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма элементов массива " + sum);

        // подсчет количества положительных элементов массива
        int kol = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 ) kol ++;
        }
        System.out.println("Количество положительных элементов массива " + kol);

        // сортировка
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < (array.length + 1) - i; j++ ) {
                if (array[j- 1] > array[j]) {
                    int E = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = E;
                   }
            }
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}
