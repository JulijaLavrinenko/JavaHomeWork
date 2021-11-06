package com.pb.Lavrinenko.hw6;

public class Animal {
    protected  String food;
    protected  String location;

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void makeNoise(){
        System.out.println("животное шумит");
    }
    public void eat(String food){
        System.out.println("животное ест " + food);
    }
    public void sleep(){
        System.out.println("зверек сладко спит");
    }
}
