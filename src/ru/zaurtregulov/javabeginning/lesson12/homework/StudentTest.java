package ru.zaurtregulov.javabeginning.lesson12.homework;

import ru.zaurtregulov.javabeginning.lesson11.Student;

public class StudentTest {

    public static void comparisonStudent(Student s1, Student s2) {
        if (s1.studentName.equals(s2.studentName) &&
                s1.studentCourse == s2.studentCourse &&
                s1.studentGrade == s2.studentGrade) {
            System.out.println("Students is equals.");
        } else {
            System.out.println("Students not equals.");
        }
    }


    public static void comparisonStudentTwo(Student s1, Student s2) {
        if (s1.studentName.equals(s2.studentName))
            if (s1.studentCourse == s2.studentCourse)
                if (s1.studentGrade == s2.studentGrade) {
                    System.out.println("Students is equals.");
                } else {
                    System.out.println("Student names and courses are the same, " +
                            "but grades are different.");
                }
            else {
                System.out.println("The students' names are the same, " +
                        "but the courses are different.");
            }
        else {
            System.out.println("The names of the students vary.");
        }


    }

    static void main() {
        Student studentOne = new Student("Joshua", 4, 7.6);
        Student studentTwo = new Student("Joshua", 4, 9.0);

        comparisonStudent(studentOne, studentTwo);

        comparisonStudentTwo(studentTwo, studentOne);




    }
}
