package com.pb.Lavrinenko.hw6;

import java.util.Objects;

public class Cat extends Animal{
    private  String formaUshey;
    private  String okras;


    public Cat() {
    }

    public Cat(String food, String location, String formaUshey, String okras) {
        super.food = food;
        super.location = location;
        this.formaUshey = formaUshey;
        this.okras = okras;
    }

    public void makeNoise(){
        System.out.println("кот мяучит");
    }
    public void eat(String food){
        System.out.println("кот ест " + food);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(formaUshey, cat.formaUshey) && Objects.equals(okras, cat.okras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formaUshey, okras);
    }

    @Override
    public String toString() {
        return "Кот (" +
                "форма ушей: " + formaUshey +
                ", окрас: " + okras +
                ')';
    }


}
