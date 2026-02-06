package ru.zaurtregulov.javabeginning.lesson13;

class TestSwitch {

}


public class Student {
    int grade;
    String name;

    static void destroyFlat() {
        System.out.println("Бабах!!!");
    }

    static void playSilent() {
    }

    static void cook() {
    }

    static void helpMotherCook() {
    }

    static void doNothing() {
    }


    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    static void main(String[] args) {

        Student student1 = new Student("Jim", 2);
        Student student2 = new Student("Smith", 3);


        if (student1.grade == 2) {
            System.out.println("Студент " + student1.name + " учится плохо.");
        } else if (student1.grade == 3) {
            System.out.println("Студент учится удовлетворительно.");
        } else if (student1.grade == 4) {
            System.out.println("Студент учится хорошо.");
        } else if (student1.grade == 5) {
            System.out.println("Студент учится отлично");
        } else {
            System.out.println("Оценка  неверна.");
        }
        System.out.println("__________________________________________");
        String value1=switch (student2.grade) {
            case 1, 2 -> "Студент учится плохо.";
            case 3 -> "Студент учится удовлетворительно.";
            case 4 -> "Студент учится хорошо.";
            case 5 -> "Студент учится отлично.";
            default -> "unknow";
        };
        System.out.println(value1);
        System.out.println("__________________________________________");


        enum FamilyMember {
            FATHER, MOTHER, SON, DAUGHTER;
        }
        FamilyMember member = FamilyMember.SON;
        if (member == FamilyMember.SON) {
            destroyFlat();
        } else if (member == FamilyMember.DAUGHTER) {
            playSilent();
        } else if (member == FamilyMember.MOTHER) {
            cook();
        } else if (member == FamilyMember.FATHER) {
            helpMotherCook();
        } else {
            doNothing();
        }

        String value = switch (1) {
            case 0 -> "abc";
            case 1 -> {
                String s = "def";
                yield s;
            }
            case 2, 3 -> "ghi";
            default -> "klm";
        };
        System.out.println(value);

    }

}
