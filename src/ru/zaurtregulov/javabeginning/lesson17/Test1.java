package ru.zaurtregulov.javabeginning.lesson17;

class Car {
}

public class Test1 {
    public Test1(String s) {
    }

    static void main() {

        StringBuilder sb1 = new StringBuilder();  //  16 - capacity(default)
        StringBuilder sb2 = new StringBuilder("Good Day!"); // 9 + 16 capacity
        StringBuilder sb3 = new StringBuilder(50);   // 50 - capacity
        StringBuilder sb4 = new StringBuilder(sb2);  //  16 - capacity(default)
        StringBuilder sb5 = new StringBuilder("Good Day!"); // 9 + 16 capacity

//        length() -> int
        System.out.println(sb2.length());   //  Output -> 9

//        charAt(int index) -> char
        System.out.println(sb2.charAt(5));  //  Output -> D

//        indexOf(String s) -> int
//        indexOf(String s, int fromIndex) -> int
        System.out.println(sb2.indexOf(" "));   //  Output -> 4
        System.out.println(sb2.indexOf("o", 2)); //  Output -> 2

//        substring(int startIndex) -> String
//        substring(int startIndex, int endIndex) -> String
        String s = sb2.substring(5);
        System.out.println(s);      //  Output -> Day!
        s = sb2.substring(0, 6);
        System.out.println(s);      //  Output -> Good D

//        subsequence(int start, int end) -> CharSequence
        System.out.println(sb2.subSequence(5, 8));   //  Output -> Day

//        append(dataType dt) -> StringBuilder
        sb2.append(22);
        System.out.println(sb2);    //  Output -> Good Day!22
        sb2.append(true);
        System.out.println(sb2);    //  Output -> Good Day!22true
        sb2.append(sb2);
        System.out.println(sb2);    //  Output -> Good Day!22trueGood Day!22true
        sb2.append(new Car());
        System.out.println(sb2);    //  Output -> Good Day!22trueGood Day!22trueru.zaurtregulov.javabeginning.lesson17.Car@8efb846

//        insert(int toIndex, dataType dt) -> StringBuilder

        System.out.println(sb5.insert(4, 55));   //  Output -> Good55 Day!
        System.out.println(sb5.insert(sb5.length(), "Hello!"));  //  Output -> Good55 Day!Hello!

//        delete(int start, int end) -> StringBuilder
        StringBuilder sb6 = new StringBuilder("Hello World.");
        sb6.delete(3, 6);
        System.out.println(sb6);    //  Output -> HelWorld.

//        deleteCharAt(int index) -> StringBuilder
        sb6.deleteCharAt(3);
        System.out.println(sb6);    //  Output -> Helorld.

//        reverse() -> StringBuilder
        sb6.reverse();
        System.out.println(sb6);    //  Output -> .dlroleH

//        replace(int start, int end, String s) -> StringBuilder
        StringBuilder sb7 = new StringBuilder("Hi all");
        sb7.replace(0, 2, "Paul");
        System.out.println(sb7);    //  Output -> Paul all

//        capacity()
        System.out.println(sb7.capacity()); //  Output -> 22

        //  При method chaining методы выполняются последовательно слева направо

        System.out.println(sb4.equals(sb2));
    }
}
