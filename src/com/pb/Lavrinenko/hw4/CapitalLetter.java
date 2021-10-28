package com.pb.Lavrinenko.hw4;
import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inStr = in.nextLine();
        String outStr = myTrans(inStr);
        System.out.println(outStr);
    }

    static String myTrans(String str) {
        // запись строки в массив символов
        char[] strChars = str.toCharArray();
        String strOut = "";
        // проверка первого символа массива буква ли это, если да то в верхний регистр
        if (Character.isLetter(strChars[0])){
            strChars[0]  = Character.toUpperCase(strChars[0]);
        }
        strOut = strOut + strChars[0]; // записываем в новуюю строку первый символ
        //проверка остальных символов в массиве, если предыдущий элемент не буква, то верхний регистр
        for (int c = 1; c < strChars.length; c++) {
           if (!Character.isLetter(strChars[c - 1])){
                strChars[c]  = Character.toUpperCase(strChars[c]);
            }
            strOut = strOut + strChars[c];
        }
       return strOut;
    }
}

