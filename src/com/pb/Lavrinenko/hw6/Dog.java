package com.pb.Lavrinenko.hw6;

import java.util.Objects;

public class Dog extends Animal{
    private  String poroda;
    private  String razmer;

    public Dog() {
    }

    public Dog(String food, String location, String poroda, String razmer) {
        super.food = food;
        super.location = location;
        this.poroda = poroda;
        this.razmer = razmer;
    }

    public void makeNoise(){
        System.out.println("собака лает");
    }
    public void eat(String food){
        System.out.println("собска ест " + food);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(poroda, dog.poroda) && Objects.equals(razmer, dog.razmer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poroda, razmer);
    }

    @Override
    public String toString() {
        return "Собака (" +
                "порода: " + poroda +
                ", размер: " + razmer +
                ')';
    }

}
