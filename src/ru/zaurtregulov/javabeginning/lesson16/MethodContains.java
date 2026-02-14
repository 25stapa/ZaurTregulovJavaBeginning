package ru.zaurtregulov.javabeginning.lesson16;

public class MethodContains {
    static void main() {

        String stringOne = new String("abcdefgabcd");
        Boolean stringTwo = stringOne.contains("def");

        System.out.println(stringTwo);

    }
}
