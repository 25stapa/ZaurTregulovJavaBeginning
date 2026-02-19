package ru.zaurtregulov.javabeginning.lesson17;

public class Test3 {
    static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuffer sb2 = new StringBuffer("Good bye!");

        String s1 = new String(sb1);
        String s2 = new String(sb2);

        System.out.println(s1);
        System.out.println(s2);

    }

}
