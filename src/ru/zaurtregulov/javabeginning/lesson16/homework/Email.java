package ru.zaurtregulov.javabeginning.lesson16.homework;

import java.util.Arrays;

public class Email {

    static void emailOne(String str) {
        int a = str.indexOf('@') + 1;
        int b = str.indexOf('.');
        String stringOut = str.substring(a, b);
        System.out.println(stringOut);
    }

    String str = "ya@yahoo.com; ona@mail.ru; ona@gmail.com;";


    static char chOne, chTwo;

    public static void emailTwo(String s) {
        int length = s.length();
        int dogIndex = 0;
        int semiIndex = 0;
        int dotIndex = 0;

        while (semiIndex < length - 1) {
            dogIndex = s.indexOf('@', dogIndex + 1);
            dotIndex = s.indexOf('.', dogIndex);
            String result = s.substring(dogIndex + 1, dotIndex);
            System.out.println(result);
            semiIndex = s.indexOf(';', semiIndex + 1);
            if (semiIndex == -1)
                break;
        }
    }

    public static void emailSplit(String s) {
        String[] emails = s.split(";\\s*");
        for (String email : emails) {
            if (!email.contains("@") || !email.contains("."))
                continue;
            if (email.isEmpty())
                continue;
            String domain = email.split("@")[1].split("\\.")[0];
            System.out.println(domain);
        }

    }

    static void main() {

//        emailTwo("ya@yahoo.com; ona@mail.co.uk; ona@gmail.com;");

        emailSplit("ya@yahoo.com; ona@mail.co.uk; ona@gmail.com;");

        String fruits = "ApplePearBanana";

        System.out.println(fruits);

        String[] arrFruits = fruits.split(":");
        System.out.println(Arrays.toString(arrFruits));


//        for (String fruit : arrFruits) {
//            if (fruit.isEmpty())
//                continue;
//            String listFruits;
//            listFruits = fruit.split(";"[1].split());
//        }



    }

}





