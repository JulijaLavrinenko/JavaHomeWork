package com.pb.Lavrinenko.hw3;
import java.util.Scanner;
import java.util.Random;

public class Bingo {
    public static void main(String[] args) {

        System.out.print("Угадайте число от 0 до 100 (либо для выхода введите - exit):");

        int a = 1;           // Счетчик попыток.
         // То что нужно угадать
        Random random = new Random();
        int find_num;
        find_num = random.nextInt(101);

        Scanner in = new Scanner(System.in);

        while (true) {

            int in_num;
            // проверка введенного пользователем
            if (!in.hasNextInt()) {
                String in_exit = in.next();
                if (!in_exit.equals("exit")) {
                    System.out.println("Извините, но это явно не число и не exit. Попробуйте снова!");
                    a++;
                    System.out.print("Попытка " + a + ":");
                } else break;
                continue;
            } else in_num = in.nextInt();
             // проверка введенного числа
            if (in_num != find_num) {
                if (in_num > find_num) {
                    System.out.println("Число " + in_num + " больше загаданного.");
                } else {
                    System.out.println("Число " + in_num + " меньше загаданного.");
                }
                a++;
                System.out.print("Попытка " + a + ":");

            } else {

            System.out.println("Bingo, Вы угадали с " + a + " попытки!");
            break;
            }
        }
        System.out.println("Конец игры!");
    }
}
