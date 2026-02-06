package ru.zaurtregulov.javabeginning.lesson11.homework;

class Car {
    String color, engine;
    int numberOfDoors;

    public Car(String color, String engine, int numberOfDoors) {
        this.color = color;
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
    }

    public void changeNumberDoors(Car c, int numberOfDoors) {
        c.numberOfDoors = numberOfDoors;
    }

    void changeColors(Car car1, Car car2) {
        String color = car1.color;
        car1.color= car2.color;
        car2.color = color;
    }

    static void main() {
        Car carOne = new Car("Black", "V12", 3);
        Car carTwo = new Car("Yellow", "V6", 4);

        carOne.changeNumberDoors(carOne, 12);

        System.out.println(carOne.color);
        System.out.println(carOne.engine);
        System.out.println(carOne.numberOfDoors);
        System.out.println();
        System.out.println(carTwo.numberOfDoors);
    }

}
