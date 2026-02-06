package ru.zaurtregulov.javabeginning.lesson12;

public class Car {

    int engineDisplacement;         //  объем двигателя
    int doorCount;                  //  количество дверей


    public Car(int engineDisplacement, int doorCount) {
        this.engineDisplacement = engineDisplacement;
        this.doorCount = doorCount;
    }
}

class CarTest {
    static void main() {
        Car carOne = new Car(3000, 3);
        Car carTwo = new Car(2400, 5);

        if (carOne.engineDisplacement > carTwo.engineDisplacement) {
            if (carOne.doorCount > carTwo.doorCount) {
                System.out.println("Объем двигателя и количество дверей" +
                        "у первого автомобиля больше.");
            } else {
                System.out.println("Объем двигателя у первого авто больше" +
                        " а количество дверей меньше");
            }
        } else {
            System.out.println("Объем двигателя у первого авто меньше.");
        }
    }


}



