package ru.zaurtregulov.javabeginning.lesson05;

public class CarTwo {
    String color;
    String engine;
    int speed;

    int increasedSpeed(int speedChange) {
        return speed += speedChange;
    }

    int braking(int speedReduction) {
        return speed -= speedReduction;
    }

    void showInfoOfCar() {
        System.out.println(
                "Machine Color - " + color +
                        "\nMashine Engine - " + engine +
                        "\nCurrent Machine Speed - " + speed + "_km/h.\n"
        );
    }
}

class CarTwoTest {
    static void main(String[] args) {
        CarTwo mercedes = new CarTwo();
        mercedes.color = "White";
        mercedes.engine = "V6";
        mercedes.speed = 60;

        mercedes.showInfoOfCar();
        mercedes.increasedSpeed(20);
        mercedes.showInfoOfCar();
        mercedes.braking(80);
        mercedes.showInfoOfCar();

    }
}
