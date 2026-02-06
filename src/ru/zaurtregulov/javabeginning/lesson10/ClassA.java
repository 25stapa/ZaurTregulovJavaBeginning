package ru.zaurtregulov.javabeginning.lesson10;

import ru.zaurtregulov.javabeginning.lesson08.Car;
import ru.zaurtregulov.javabeginning.lesson08.Student;

public class ClassA {
    static void main(String[] args) {
        Car car = new Car();
        Student student = new Student("Samanta", 3);
        ru.zaurtregulov.javabeginning.lesson09.Car mazda =
                new ru.zaurtregulov.javabeginning.lesson09.Car("Sand","V12");

        System.out.println(car.color);
        System.out.println(car.engine);

    }
}
