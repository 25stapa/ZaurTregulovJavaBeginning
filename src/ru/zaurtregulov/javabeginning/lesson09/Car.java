package ru.zaurtregulov.javabeginning.lesson09;

import java.lang.reflect.Type;

public class Car {
    String color, engine;
    static int count;

    public Car(String color, String engine) {
        count++;
        this.color = color;
        this.engine = engine;
        System.out.println("New object is created");
    }

    public void showColor() {
        System.out.println("Color this car - " + color);
    }

    public void changeColor(String color) {
        int price = 5_000;
        System.out.println("Car color before change: " + this.color + "\n" +
                "Price of the car before color change - " + price);
        this.color = color;
        System.out.println("Car color after change: " + color);
        price += 1_000;
        System.out.println("Price of the car after color change - " + price);
    }
}

class CarTest {
    public static void main() {
        Car mercedes = new Car("Black", "V8");

        mercedes.showColor();

        mercedes.changeColor("Yellow");

        Car volvo = new Car("Green", "V12");

    }
}