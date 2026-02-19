package ru.zaurtregulov.javabeginning.lesson17.homework;

public class MethodEquality {
    public static boolean equality(StringBuilder sb1, StringBuilder sb2) {
        boolean result = true;
        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;

    }
}

class MethodEqualityDemo {
    static void main() {
        StringBuilder sb1 = new StringBuilder("Hello.");
        StringBuilder sb2 = new StringBuilder("Hello.");
        StringBuilder sb3 = new StringBuilder("hello.");

        boolean a = MethodEquality.equality(sb1, sb2);
        System.out.println(a);
    }
}