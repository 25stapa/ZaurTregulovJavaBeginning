package ru.zaurtregulov.javabeginning.lesson04.homework;

public class Student {
    Student(int idStudent, int yearOfBirth, String name, String lastName, String course,
            double averageEconomicAssessment, double averageMathAssessment,
            double averageForeignLanguageRating) {
        this.idStudent = idStudent;
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.lastName = lastName;
        this.course = course;
        this.averageEconomicAssessment = averageEconomicAssessment;
        this.averageMathAssessment = averageMathAssessment;
        this.averageForeignLanguageRating = averageForeignLanguageRating;
    }

    Student(int idStudent, String name, String lastName, String course) {
        this(idStudent, 0, name, lastName, course,
                0.0, 0.0,
                0.0
        );
    }

    Student() {
    }

    int idStudent, yearOfBirth;
    String name, lastName, course;
    double averageMathAssessment, averageEconomicAssessment,
            averageForeignLanguageRating, averageArithmetic;

    double averageValue(Student student) {
        double averageValue = (student.averageMathAssessment +
                student.averageEconomicAssessment +
                student.averageForeignLanguageRating) / 3;
        System.out.println("Student's arithmetic average score " +
                student.name + " " + student.lastName + " - " + averageValue + "\n");
        return averageValue;
    }
}


class StudentTest {
    static void main() {
        Student studentOne = new Student();

        studentOne.idStudent = 1;
        studentOne.name = "Mike";
        studentOne.lastName = "Krasovsky";
        studentOne.yearOfBirth = 2020;
        studentOne.averageMathAssessment = 10.7;
        studentOne.averageEconomicAssessment = 11.3;
        studentOne.averageForeignLanguageRating = 9.45;

        Student studentTwo = new Student(2, "Sam", "Johansson",
                "Physic");
        studentTwo.yearOfBirth = 2019;
        studentTwo.averageMathAssessment = 9.7;
        studentTwo.averageEconomicAssessment = 10.3;
        studentTwo.averageForeignLanguageRating = 7.45;

        Student studentThree = new Student();

        studentThree.idStudent = 3;
        studentThree.name = "Julia";
        studentThree.lastName = "Smith";
        studentThree.yearOfBirth = 2015;
        studentThree.averageMathAssessment = 10.5;
        studentThree.averageForeignLanguageRating = 11.5;

        Student studentFour = new Student(4, 2001, "Garry",
                "Smith", "Mathematics",
                8.7, 7.6,
                6.4);

        studentOne.averageValue(studentOne);

        studentTwo.averageValue(studentTwo);

        studentThree.averageValue(studentThree);

        studentFour.averageValue(studentFour);

    }

}