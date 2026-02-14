package ru.zaurtregulov.javabeginning.lesson13.homework;

class Month {
    void serialNumberOfTheMonth(int month) {
        switch (month) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("Juli");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> throw new IllegalStateException("Unexpected value: " + month);
        }
    }

    public  static void numberOfDaysOfTheMonth(int a) {
        int day = switch (a) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> throw new IllegalStateException("Unexpected value: " + a);
        };
        String month = switch (a) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "Juli";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Unknow";
        };

        System.out.println("Number of days in " + month + ": " + day);
    }

    static void main() {
        numberOfDaysOfTheMonth(5);
        Month.numberOfDaysOfTheMonth(9);

    }
}
