package com.pb.Lavrinenko.hw9;
import java.io.*;
import java.util.Random;
import java.util.stream.Collectors;

public class FileNumbers {

    public static void main(String[] args) {
       createNumbersFile();
       createOddNumbersFile();

    }

    public static void createNumbersFile() {
        try (FileWriter writer = new FileWriter("numbers.txt", false)) {
            StringBuilder str = new StringBuilder();
            Random random = new Random();

            for (int i = 1; i <= 100; i++) {
                String text = String.format("%-3d", random.nextInt(100));
                str.append(text);
                if (i % 10 == 0) {
                    str.append("\n");
                }
            }
            System.out.println(str); // демонстрация на консоль содержимого файла
            writer.write(str.toString());
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
   public static void createOddNumbersFile() {
        String textInFile = "";
        try (BufferedReader reader = new BufferedReader(new FileReader("numbers.txt"))) {
            textInFile = reader.lines()
                    .map(n -> replaceChetNum(n))
                    .collect(Collectors.joining("\n"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter writer = new FileWriter("odd-numbers.txt", false)) {
           writer.write(textInFile);
           writer.flush();
       } catch (IOException e) {
           e.printStackTrace();
       }
        System.out.println(textInFile); // демонстрация на консоль содержимого файла
    }

    // замена четых цифр на 0
    private static String replaceChetNum(String strN) {
        String[] arrN = strN.split(" ");
        StringBuilder str = new StringBuilder();
        String text = "";
        try {
            final int size = arrN.length;
            for (int i = 0; i < size; i++) {
                if (arrN[i].length() > 0) {

                    int number = Integer.parseInt(arrN[i]);

                    if (number % 2 == 0) {
                        number = 0;
                        text = String.format("%-3d", number);
                    } else {
                        text = String.format("%-3d", number);
                    }
                    str.append(text);
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return str.toString();
    }
}


