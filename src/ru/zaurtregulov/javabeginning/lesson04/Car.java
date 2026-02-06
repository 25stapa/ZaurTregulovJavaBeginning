package ru.zaurtregulov.javabeginning.lesson04;


public class Car {
    String color;
    String engine;

    Car(String color, String engine){
        this.color = color;
        this.engine = engine;
    }

}

class CarTest {
    static void main() {
        Car car1 = new Car("Yellow", "V12");

        System.out.println(car1.color);
        System.out.println(car1.engine);

    }

}
