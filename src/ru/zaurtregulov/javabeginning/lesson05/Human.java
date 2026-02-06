package ru.zaurtregulov.javabeginning.lesson05;

public class Human {
    String name;
    Car3 car;
    BankAccount bankAccount;

    void personInformation() {
        System.out.println("Name - " + name +
                "\nColor of auto - " + car.color +
                "\nBalance of account - " + bankAccount.balance + " $");
    }
}

class Car3 {
    Car3(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    String color;
    String engine;
}

class BankAccount {
    BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    int id;
    double balance;
}

class HumanTest {
    static void main() {
        Human human = new Human();
        human.name = "David";
        human.car = new Car3("Yellow", "V12");
        human.bankAccount=new BankAccount(1,100.89);

        human.personInformation();
    }
}