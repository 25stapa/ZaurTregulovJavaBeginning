package ru.zaurtregulov.javabeginning.lesson06;

public class EmployeeThis {

    EmployeeThis(int id, String lastName, int age) {
        this(id, lastName, age, 0.0, null);
    }

    EmployeeThis(String lastName, int age) {
        this(0, lastName, age, 0.0, null);
    }

    EmployeeThis(int id, String lastName, int age, double salary, String department) {
        this.id = id;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    int id, age;
    String lastName, department;
    double salary;
}

class EmployeeThisTest {
    static void main(String[] args) {

        EmployeeThis employeeOneFirst =
                new EmployeeThis("Johansson", 23);

        EmployeeThis employeeOneSecond =
                new EmployeeThis(2, "Smith", 34);

        System.out.println(employeeOneSecond.lastName);
        System.out.println(employeeOneFirst.age);
    }
}