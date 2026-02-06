package ru.zaurtregulov.javabeginning.lesson14;

public class NestedLoop {

    public static void time() {
        for (int hour = 0; hour <= 23; hour++) {
            for (int min = 0; min <= 59; min++) {
                System.out.println(hour + " : " + min);
            }
        }
    }

    static void main(String[] args) {

        time();

    }

}

