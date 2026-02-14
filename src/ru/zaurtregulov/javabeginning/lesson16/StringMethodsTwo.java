package ru.zaurtregulov.javabeginning.lesson16;

public class StringMethodsTwo {
    static void main() {

        int a = 5, b = 6;
        String string = "_ok";
        System.out.println(a + b + string);     //  Output -> 11_ok

        System.out.println("" + a + b + string);     //  Output -> 56_ok

        System.out.println("" + (a + b) + string);     //  Output -> 11_ok
    }
}
