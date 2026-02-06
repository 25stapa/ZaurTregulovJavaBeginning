package ru.zaurtregulov.javabeginning.lesson06;

public class MethodOverloading {

    void show(int int1) {
        System.out.println(int1);
    }

    void show(boolean boolOne) {
        System.out.println(boolOne);
    }

    void show
            (String string) {
        System.out.println(string);
    }

    void show (String s, int a){
        System.out.println("String: " + s + "\nint: "+ a);
    }

    void show (int a,String s){
        System.out.println("What a nice day!");
    }
}

class MethodOverloadingTest {
    static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        int a = 500;
        methodOverloading.show(a);

        boolean b = true;
        methodOverloading.show(b);

        String str1 = "Test.";
        methodOverloading.show(str1);

        methodOverloading.show(10,"Hi!!!");
    }

}