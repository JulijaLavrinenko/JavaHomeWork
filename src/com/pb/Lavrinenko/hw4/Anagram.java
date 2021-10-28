package com.pb.Lavrinenko.hw4;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите пераую строку: ");
        String inStr1 = in.nextLine();
        System.out.print("Введите вторую строку: ");
        String inStr2 = in.nextLine();
        System.out.println(myAnagrama(inStr1, inStr2));

    }

    static String myAnagrama(String str1, String str2){

        // удаление лишних символов из строк
        String strOut1 = str1.replaceAll("[^\\p{L}\\p{N}]+", "");
        String strOut2 = str2.replaceAll("[^\\p{L}\\p{N}]+", "");
        // перевод строк в нижний регистр
        strOut1 = strOut1.toLowerCase();
        strOut2 = strOut2.toLowerCase();

        // проверка на совпадение длин строк
        if (strOut1.length()!= strOut2.length()){
            return "Введенные фразы не являются анаграммой";
        } else {
            // перевод строк в массивы символов
            char[] strChars1 = strOut1.toCharArray();
            char[] strChars2 = strOut2.toCharArray();
            //сортировка массивов
            Arrays.sort(strChars1);
            Arrays.sort(strChars2);
            //перевод из массивов в строки
            String sortStr1 = new String(strChars1);
            String sortStr2 = new String(strChars2);
            //сравнение строк
            if(sortStr1.equals(sortStr2)){
                return "Ура, это анаграмма";
            }else{
                return "Введенные фразы не являются анаграммой";
            }
        }

    }
}
