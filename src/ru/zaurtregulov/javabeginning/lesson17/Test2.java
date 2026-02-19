package ru.zaurtregulov.javabeginning.lesson17;

public class Test2 {
    static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = sb1.append("45");
        sb2 = sb2.append("6").append("7");

        System.out.println("sb1 = " + sb1);
        System.out.println("sb2 = " + sb2);

        //  2 конструктора класса String

        StringBuilder sb3 = new StringBuilder("Hello");
        String s1 = new String(sb3);

        StringBuffer sb4 = new StringBuffer("Hello");
        String s2 = new String(sb4);

    }
}
