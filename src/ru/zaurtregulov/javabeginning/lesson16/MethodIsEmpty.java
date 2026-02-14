package ru.zaurtregulov.javabeginning.lesson16;


public class MethodIsEmpty {
    static void test() {
        int i = 0;
        while (++i < 15) {
            if (i % 2 != 0)
                System.out.print(i + "; ");
        }

    }

    public static void main(String[] args) {
        String string = "               ";
        System.out.println(string.isEmpty());

        test();

    }
}
