package ru.zaurtregulov.javabeginning.lesson08;

public class Car {
    public String color = "Blue";
    public String engine = "V6";
}

class Human {
    String name = "George";
    final Car car = new Car();

    static void main(String[] args) {
        Human humanOne = new Human();
        System.out.println(humanOne.car.engine);

        humanOne.car.engine = "V8";
        System.out.println(humanOne.car.engine);


    }
}