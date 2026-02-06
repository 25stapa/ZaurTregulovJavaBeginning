package ru.zaurtregulov.javabeginning.lesson07;

public class Employee {
    public double salary;

    public void doubleSalary() {
        salary *= 2;
        System.out.println("Double salary is equal: " + salary + " USD");
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    static void main(String[] args) {
        Employee employee = new Employee(500);
        System.out.println(employee.salary);
        employee.doubleSalary();
    }
}

class EmployeeTest {
    static void main(String[] args) {
        Employee employee = new Employee(500);
        System.out.println(employee.salary);
        employee.doubleSalary();
    }

}