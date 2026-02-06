package ru.zaurtregulov.javabeginning.lesson13;

public class Employee {
    static void main() {

        String day = "Sunday";
        String value = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Working to18:00";
            case "Saturday" -> "Working to14:00";
            case "Sunday" -> "DayOff";
            default -> throw new IllegalStateException("Unexpected value: " + day);
        };
        System.out.println(value);
    }
}
