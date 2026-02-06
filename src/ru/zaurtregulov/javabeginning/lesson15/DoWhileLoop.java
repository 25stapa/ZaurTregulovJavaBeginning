package ru.zaurtregulov.javabeginning.lesson15;

public class DoWhileLoop {
    static void main() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while (i <= 10);

        System.out.println("*************** 1 ****************");

        int hour = 0;
        OUTER:
        do {
            int min = 0;
            INNER:
            while (min < 60) {
                System.out.println(hour + " : " + min);
                min++;
            }
            hour++;
        } while (hour < 24);

        System.out.println("*************** 2 ****************");


        OUTER:
        for (int hour1 = 0; hour1 < 24; hour1++) {
            int min = 0;
            INNER:
            while (min < 60) {
                System.out.println(hour1 + " : " + min);
                min++;
            }
        }

    }
}
