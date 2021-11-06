package com.pb.Lavrinenko.hw6;

import java.util.Objects;

public class Horse extends Animal{
    private  String hozPrimenenie;
    private  String mast;


    public Horse() {
    }

    public Horse(String food, String location, String mast, String hozPrimenenie) {
        super.food = food;
        super.location = location;
        this.hozPrimenenie = hozPrimenenie;
        this.mast = mast;
    }

    public void makeNoise(){
        System.out.println("лошадь ржет");
    }
    public void eat(String food){
        System.out.println("лошадь ест " + food);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(hozPrimenenie, horse.hozPrimenenie) && Objects.equals(mast, horse.mast);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hozPrimenenie, mast);
    }

    @Override
    public String toString() {
        return "Лошадь (" +
                "масть: " + mast +
                ", используется в качестве: " + hozPrimenenie +
                ')';
    }

}
