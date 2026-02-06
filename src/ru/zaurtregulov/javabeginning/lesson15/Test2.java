package ru.zaurtregulov.javabeginning.lesson15;

public class Test2 {
    static void main() {
        int money = 100;
        while (money > 0) {
            System.out.println("Play.");
            money -= 10;
            System.out.println("You have an amount left equal to " + money);
        }

        boolean b = true;
        int a = 1;

        while (b) {
            System.out.println(a);
            if (a % 3 == 0 && a % 7 == 0) {
                b = false;  //  or break;
            }
            a++;
        }
        System.out.println("*************** 1 *************");
        int g = 5;
        while (++g < 10) {
            g++;
        }
        System.out.println(g);   // output 10

        System.out.println("*************** 2 *************");
        int g1 = 5;
        while (g1++ < 10) {
            g1++;
        }
        System.out.println(g1);   //    output 12



    }
}