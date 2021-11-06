package com.pb.Lavrinenko.hw6;

public class VetСlinic {
    public static void main(String[] args) throws Exception {

        Cat cat = new Cat("рыбка", "дача", "вислоухий", "рыжий");
        Dog dog = new Dog("косточки", "двор", "влчак", "средний");
        Horse horse = new Horse("овес", "ферма", "гнедая", "скаковая");

        Animal[] animals = new Animal[]{cat, dog, horse};

        Class vetClazz = Class.forName("com.pb.Lavrinenko.hw6.Veterinarian");

        Object obj = vetClazz.newInstance();

        for (Animal animal : animals) {
            ((Veterinarian) obj).treatAnimal(animal);
        }

    }
}
