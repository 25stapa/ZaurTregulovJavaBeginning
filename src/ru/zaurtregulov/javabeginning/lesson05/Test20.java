package ru.zaurtregulov.javabeginning.lesson05;

public class Test20 {

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    int amount2(int a, int b, int c) {
        return sum(a, b, c) / 3;
    }

}

class Test21 {
    static void main() {

        Test20 t = new Test20();
        int sumOfThreeNumbers = t.sum(1, 2, 3);
        System.out.println("Sum Of Three Numbers 1, 2, 3 is " + sumOfThreeNumbers);

        System.out.println("Среднеарифметическое - " + t.amount2(20, 40, 60));

    }
}
