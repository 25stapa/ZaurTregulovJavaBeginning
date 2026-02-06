package ru.zaurtregulov.javabeginning.lesson06;

public class MethodOverloadingTwo {

    int sum(int numberIntegerOne, int numberIntegerTwo) {
        return numberIntegerOne + numberIntegerTwo;
    }

    String sum(String stringOne, String stringTwo) {
        return stringOne + stringTwo;
    }

}

class MethodOverloadingTwoTest {
    public static void main(String[] args) {

        MethodOverloadingTwo methodOverloadingTwo = new MethodOverloadingTwo();
        int a = methodOverloadingTwo.sum(5, 7);
        System.out.println(a);
        String string = methodOverloadingTwo.sum("Hi! ", " My friend!");
        System.out.println(string);




    }
}
