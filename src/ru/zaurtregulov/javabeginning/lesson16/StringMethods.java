package ru.zaurtregulov.javabeginning.lesson16;

public class StringMethods {
    static void main() {

        //  length() -> int
        String stringOne = new String("abcdefgabcd");

        int a = stringOne.length();
        System.out.println("Number of characters in a word " + stringOne + " is " + a);
        //  ---------------------------------------------------------------------------
        //  charAt(int index) -> char
        char ch1 = stringOne.charAt(3);
        System.out.println(ch1);        //  output -> 'v'
        //  ---------------------------------------------------------------------------

        //  indexOf(char c) -> int
        //  indexOf(String s) -> int
        //  indexOf(char c, int fromIndex) -> int
        //  indexOf(String s, int fromIndex) -> int
        int b = stringOne.indexOf('f');
        System.out.println(b);          //  output -> 5

        int b1 = stringOne.indexOf("def");
        System.out.println(b1);         //  output -> 3

        int b2 = stringOne.indexOf("S");
        System.out.println(b2);         //  output -> -1

        int b3 = stringOne.indexOf('a', 5);
        System.out.println(b3);         //  output -> 7
        //  ---------------------------------------------------------------------------

        //  startsWith(String prefix) -> boolean
        //  startsWith(String prefix, int from) -> boolean
        boolean booleanOne = stringOne.startsWith("abc");
        System.out.println(booleanOne);    // output -> true

        boolean booleanTwo = stringOne.startsWith("abc", 7);
        System.out.println(booleanTwo);    // output -> true
        //  ---------------------------------------------------------------------------

        //  endsWith(String suffix) -> boolean
        boolean booleanThree = stringOne.endsWith("abc");
        System.out.println(booleanThree);   //  Output -> false
        //  ---------------------------------------------------------------------------

        //  substring(int beginIndex) -> String
        //  substring(int beginIndex, int endIndex) -> String
        String stringTwo = stringOne.substring(3);
        System.out.println(stringTwo);      // Output -> defgabcd
        System.out.println(stringOne);      // Output -> abcdefgabcd

        String stringThree = stringOne.substring(3, 8);
        System.out.println(stringThree);    //  Output -> defga

        String stringFive = stringOne.substring(3, 11);
        System.out.println(stringFive);    //  Output -> abcdefgabcd
        //  ---------------------------------------------------------------------------

        //  trim() -> String
        String stringFour = stringOne.trim();
        System.out.println(stringFour);     // Output -> abcdefgabcd(Убирает пробелы с края)
                                            //  в середине пробелы не убираются


    }
}
