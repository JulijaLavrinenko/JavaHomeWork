package com.pb.Lavrinenko.hw10;

import java.util.Arrays;

public class NumBox <T extends Number>{
    private final T[] numbers;
    private int size;
    private int indexNow;

    public NumBox(int size) {
        this.size = size;
        numbers = (T[]) new Number[size];

    }

    public static class SizeException extends Exception {
        public SizeException(String message) {
            super(message);
        }

    }

    public void add(T num) throws SizeException{
        if(this.indexNow < size) {
            numbers[this.indexNow]=num;
            this.indexNow=this.indexNow+1;
        } else throw new SizeException("Превышено количество элементов масива");

    }

    public T get(int index) {
        return numbers[index];
    }

   public int length(){
        return indexNow;
    }

    public double average(){

        double sum = 0;
        for (int i=0; i<=length()-1; i++) {
            sum += numbers[i].doubleValue();
            i++;
        }
        return sum/indexNow;
    }

    public double sum(){
        double sum = 0;
        for (int i=0; i<=length() - 1; i++) {
            sum += numbers[i].doubleValue();
        }
        return sum;
    }

    public T max(){
        T max = numbers[0];
        for (int i=1; i<=length()-1; i++) {
            if(numbers[i].doubleValue() > max.doubleValue()) {
                max = numbers[i];
            }

        }
        return max;
    }

    public void printNum() {
        System.out.print("Массив: ");
        System.out.println(Arrays.toString(numbers));
    }

}
