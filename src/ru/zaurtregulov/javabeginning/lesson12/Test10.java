package ru.zaurtregulov.javabeginning.lesson12;

public class Test10 {


    void maxNumber(int numOne, int numTwo, int numThree) {
        if (numOne > numTwo && numOne > numThree) {
            System.out.println(numOne + " is maximal.");
        } else if (numTwo > numOne && numTwo > numThree) {
            System.out.println(numTwo + " is maximal.");
        } else {
            System.out.println(numThree + " is maximal.");
        }
    }


    static void main(String[] args) {


        Test10 test10 = new Test10();

        int salary = 1500;
        if (salary < 200) {
            System.out.println("The salary is very low!!!");
        } else if (salary < 400) {
            System.out.println("The salary is medium");
        } else if (salary < 600) {
            System.out.println("The salary is high");
        } else {
            System.out.println("The salary is very good!!!");
        }

        test10.maxNumber(2, 7, 9);

        int a = 10, b = 20;


        int maximum = (a > b) ? a : b;
        int minimumNumber = Math.min(a,b);
        System.out.println(maximum);
        System.out.println();
        System.out.println(minimumNumber);
        System.out.println("Проверка е");


    }

}
