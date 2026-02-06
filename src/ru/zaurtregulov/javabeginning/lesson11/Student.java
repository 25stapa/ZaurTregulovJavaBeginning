package ru.zaurtregulov.javabeginning.lesson11;

import ru.zaurtregulov.javabeginning.lesson12.homework.*;

public class Student {
    public String studentName;
    public int studentCourse;
    public double studentGrade;

    public Student(String studentName, int studentCourse, double studentGrade) {
        this.studentName = studentName;
        this.studentCourse = studentCourse;
        this.studentGrade = studentGrade;
    }

    public static void swapStudents(Student s1, Student s2) {
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println(s1.studentName);
    }

    public static void changeName(Student s1) {
        s1.studentName = "Joshua";
    }


    static void main() {

        Student studentSmith =
                new Student("Smith", 3, 9.5);

        Student studentGeorge =
                new Student("George", 1, 5.3);

        swapStudents(studentSmith, studentGeorge);

        System.out.println(studentSmith.studentName);

        changeName(studentSmith);

        System.out.println();


        System.out.println(studentSmith.studentName);


    }
}
