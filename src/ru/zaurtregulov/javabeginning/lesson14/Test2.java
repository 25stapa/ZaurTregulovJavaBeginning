package ru.zaurtregulov.javabeginning.lesson14;

public class Test2 {
    static void main() {

//        for (int i = 1; i <= 30; i ++) {
//            System.out.println(i);
//        }

        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.println("Number " + "<" + i + ">" + " is even.");
            } else {
                System.out.println("Number " + "<" + i + ">" + " is not even.");

                switch (i) {
                    case 7 -> System.out.println("This is my favorite number");
                    case 9 -> System.out.println("And this is my brother's favorite number");
                }

            }

        }
    }

}
