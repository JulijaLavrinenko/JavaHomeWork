package com.pb.Lavrinenko.hw2;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int operand1, operand2;
        String sign;

        Scanner in = new Scanner(System.in);

        System.out.print("Введите первый операнд (целое число): ");
        operand1 = in.nextInt();

        System.out.print("Введите второй операнд (целое число): ");
        operand2 = in.nextInt();

        System.out.print("Введите операцию ( + , - , * , / ): ");
        sign = in.next();

        switch (sign.charAt(0)) {   // по-скольку switch не желает работать со String использую такой метод
            case '+':
                System.out.println("result: " + (operand1 + operand2));
                break;
            case '-':
                System.out.println("result: " + (operand1 - operand2));
                break;
            case '*':
                System.out.println("result: " + (operand1 * operand2));
                break;
            case '/':
                if (operand2 != 0) {
                   System.out.println("result: " + ((double)operand1 / operand2));
                } else  {
                   System.out.println("Ошибка деления на 0. Операция отменена.");
                }
                break;
        }
     }

}
