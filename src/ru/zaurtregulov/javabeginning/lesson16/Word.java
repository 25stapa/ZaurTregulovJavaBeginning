package ru.zaurtregulov.javabeginning.lesson16;

public class Word {
    String text = "StringMethods";
    String textTwo = "AbraCadabra";
}

class WordDemo {
    public static String textThree = "UkeChuka";

    static void main() {

        Word word = new Word();

        //  indexOf(char c) -> int
        int a = word.text.indexOf('M');
        System.out.println(a);
        // Output -> 6

        //  indexOf(String s) -> int
        int a1 = word.text.indexOf("t");
        System.out.println(a1);
        // Output -> 1

        //  indexOf(char c, int fromIndex) -> int
        int a2 = word.text.indexOf('t', 3);
        System.out.println(a2);
        // Output -> 8

        //  indexOf(String s, int fromIndex) -> int
        int a3 = word.text.indexOf("th", 2);
        System.out.println(a3);
        // Output -> 8

        //  startsWith(String prefix) -> boolean
        boolean boolOne = word.textTwo.startsWith("Abra");
        System.out.println(boolOne);
        // Output -> true

        //  startsWith(String prefix, int from) -> boolean
        boolean boolTwo = word.textTwo.startsWith("aCa", 3);
        System.out.println(boolTwo);
        // Output -> true

        //  endsWith(String suffix) -> boolean
        boolean boolThree = textThree.endsWith("uka");
        System.out.println(boolThree);
        // Output -> true


        //  substring(int beginIndex) -> String
        String stringSubstr  = textThree.substring(3);
        System.out.println(stringSubstr);   // Output -> Chuka
        System.out.println(textThree);      // Output -> UkeChuka

        //  substring(int beginIndex, int endIndex) -> String
        String stringSubstrTwo = word.textTwo.substring(4,9);
        System.out.println(word.textTwo);    // Output -> AbraCadabra
        System.out.println(stringSubstrTwo); // Output -> Cadab



        String stringToLowCase = word.text.toLowerCase();
        System.out.println(stringToLowCase);

        String stringToUppCase = word.text.toUpperCase();
        System.out.println(stringToUppCase);

        //  length() -> int
        int text = word.textTwo.length();
        System.out.println("Number of characters in a word " +
                "\"" + word.textTwo + "\" - " + text);
        // Output -> Number of characters in a word "AbraCadabra" - 11

        //  charAt(int index) -> char
        char stringCharAt = word.textTwo.charAt(4);
        System.out.println(stringCharAt);
        // Output -> C


    }
}
