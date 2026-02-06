package ru.zaurtregulov.javabeginning.lesson07;

public class OtherClass {
    static void main(String[] args) {
        Employee employee = new Employee(500);
        System.out.println(employee.salary);
        employee.doubleSalary();
    }
}
