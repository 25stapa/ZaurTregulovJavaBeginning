package ru.zaurtregulov.javabeginning.lesson06.homework;

public class SumNumbers {

    int result;

    int sumNumbers(int a, int b, int c, int d) {
        int result = a + b + c + d;
        this.result = result;
        printResult();
        return result;
    }

    int sumNumbers(int a, int b, int c) {
        int result = a + b + c;
        this.result = result;
        printResult();
        return result;
    }

    int sumNumbers(int a, int b) {
        int result = a + b;
        this.result = result;
        printResult();
        return result;
    }

    int sumNumbers(int a) {
        int result = a;
        this.result = result;
        printResult();
        return result;
    }

    int sumNumbers() {
        int result = 0;
        this.result = result;
        printResult();
        return result;
    }

    void printResult() {
        System.out.print("The sum of all numbers is equal " + result + "\n");
    }

}

class SumNumbersTest {
    static void main(String[] args) {
        SumNumbers sumNumbers = new SumNumbers();

        sumNumbers.sumNumbers();
        sumNumbers.sumNumbers(3);
        sumNumbers.sumNumbers(2, 4);
        sumNumbers.sumNumbers(9, 4, 2);
        sumNumbers.sumNumbers(0, 7, 3, 6);
        sumNumbers.sumNumbers(678, 543);
    }
}