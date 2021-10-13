package com.pb.Lavrinenko.hw2;
import java.util.Scanner;
public class Interval {
    public static void main(String[] args) {
        int operand1;
        Scanner in = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        operand1 = in.nextInt();

        if (operand1 >= 0 && operand1 <= 14) {
            System.out.println("Число попадает в интервал [0-14]");
        } else  if (operand1 >= 15 && operand1 <= 35) {
            System.out.println("Число попадает в интервал [15-35]");
        } else  if (operand1 >= 36 && operand1 <= 50) {
            System.out.println("Число попадает в интервал [36-50]");
        } else  if (operand1 >= 51 && operand1 <= 100) {
            System.out.println("Число попадает в интервал [51-100]");
        } else System.out.println("Число не попадает в интервал [0-100]");
     }
}
