package ru.zaurtregulov.javabeginning.lesson06;

public class Employee {

    int id, age;
    String lastName, department;
    double salary;

    Employee(int id, String lastName, int age) {
        this.id = id;
        this.lastName = lastName;
        this.age = age;
    }

    Employee(String lastName, int age) {
        this.lastName = lastName;
        this.age = age;
    }

    Employee(int id, String lastName, int age, double salary, String department) {
        this.id = id;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employeeOne = new Employee(1, "Johansson", 21);
        System.out.println(employeeOne.id);

        Employee employeeTwo = new Employee("Smith", 21);
        System.out.println(employeeTwo.lastName + " " + employeeTwo.department);

        Employee employeeThree = new Employee(2, "Forest",
                23, 987.87, "IT");
        System.out.println(employeeThree.department);
    }
}