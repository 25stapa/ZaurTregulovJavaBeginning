package ru.zaurtregulov.javabeginning.lesson08;

public class Test1 {
    public final int a;

    Test1() {
        a = 10;
    }

    Test1(boolean b) {
        a = 15;
    }

    public void abc(short s) {
        byte b = 10;
        System.out.println(s + b);
    }


    static void main(String[] args) {
        Test1 test1 = new Test1();
        System.out.println(test1.a);
    }

}
