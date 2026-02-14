package ru.zaurtregulov.javabeginning.lesson16;

public class Test3 {
    static void main() {

        String stringOne = new String("Ok.");
        String stringFour = new String("Ok.");
        String stringTwo = "Ok.";
        String stringThree = "Ok.";


        boolean boolOne = stringThree == stringTwo;
        boolean boolTwo = stringOne.equals(stringFour);
        boolean boolThree = stringOne == stringFour;

        System.out.println(boolOne);    //  Output -> true
        System.out.println(boolTwo);    //  Output -> true
        System.out.println(boolThree);  //  Output -> false

    }
}
