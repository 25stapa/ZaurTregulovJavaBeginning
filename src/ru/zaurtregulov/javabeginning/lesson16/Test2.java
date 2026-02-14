package ru.zaurtregulov.javabeginning.lesson16;

public class Test2 {
    static void main() {
        String string = "Чтоб мудро жизнь прожить, знать надобно немало, " +
                "Два важных правила запомни для начала: Ты лучше голодай," +
                " чем есть что попало есть, И лучше будь один, чем вместе " +
                "с кем попало.";
        String stringOne = string.toUpperCase();

        char ch1, ch2;

        for (int i = 0; i < string.length(); i++) {
            ch1 = string.charAt(i);
            ch2 = stringOne.charAt(i);

            if (ch1 != ',' && ch1 != ' ' && ch1 != ':' && ch1 != '.' && ch1 == ch2){
                System.out.println();
                System.out.print(ch1);
                continue;
            }
            System.out.print(ch1);
        }



    }
}
