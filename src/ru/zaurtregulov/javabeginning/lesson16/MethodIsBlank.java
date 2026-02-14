package ru.zaurtregulov.javabeginning.lesson16;

public class MethodIsBlank {
    static void main() {
        String s1 = "privet";
        System.out.println(s1.isBlank());   //  Output -> false

        String s2 = "     ";
        System.out.println(s2.isBlank());   //  Output -> true




    }
}
