package ru.zaurtregulov.javabeginning.lesson08;

public class Student {
    String name;
    int course;
    static int count;
    int a;

    public Student(String name, int course) {
        count++;
        this.name = name;
        this.course = course;
        System.out.println("Student # " + count + " is created");
    }

    public static void showCount() {
        System.out.println("Total students created " + count);
    }

    public void showWelcome() {
        System.out.println("Welcome to the student class!");
    }

    void abc() {
        a++;
        count++;
    }

    static void abcd() {
        count++;
        Student student = new Student("Jim", 4);
        student.a++;
    }


    public static void main(String[] args) {
        Student studentOne = new Student("George", 3);
        Student studentTwo = new Student("Will", 1);
        Student studentThree = new Student("Julia", 2);

        System.out.println(studentOne.name);
        System.out.println(Student.count);

        showCount();

        abcd();

    }
}