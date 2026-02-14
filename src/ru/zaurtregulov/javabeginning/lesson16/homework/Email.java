package ru.zaurtregulov.javabeginning.lesson16.homework;

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
        int dotIndex;

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
        System.out.println("*********************************");
        String[] emails = s.split(";\\s*");
//        System.out.println(Arrays.toString(emails));
        for (String e : emails) {
            if (e.isEmpty())
                continue;
//            if (e.contains("@") || e.contains("."))
//                continue;
            String domain = e.split("@")[1].split("\\.")[0];
            System.out.println(domain);
        }
            System.out.println("*********************************");
    }

    public static void fruit(String s) {
        System.out.println("*********************************");
        String[] fruit = s.split(",\\s*");
        for (String f : fruit) {
            if (f.isEmpty())
                continue;
            String result = f.split(",")[0];
            System.out.println(result);
        }
        System.out.println("*********************************");
    }

    static void main() {

//        emailTwo("ya@yahoo.com; ona@mail.co.uk; ona@gmail.com;");
        emailSplit("ya@yahoo.com; ona@mail.co.uk; ona@gmail.com;");

        fruit("Apple, Pear, Banana");
    }
}



