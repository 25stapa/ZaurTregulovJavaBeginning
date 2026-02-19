package ru.zaurtregulov.javabeginning.lesson16;

public class MethodsStripStripLeadingStripTrailing {
    static void main() {
        String string = "  Privet          ";
       String result = string.strip();
        System.out.println(result);     //  Output -> Privet

        result = string.stripLeading();
        System.out.println(result);     //  Output -> Privet
        //  Пробелы убираются только перед словом "Privet"

        result = string.stripTrailing();
        System.out.println(result);     //  Output -> Privet
        //  Пробелы убираются только после слова "Privet"

    }
}
