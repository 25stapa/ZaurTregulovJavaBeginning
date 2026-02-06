package ru.zaurtregulov.javabeginning.lesson11;

public class Employee {
    public String name;
    public double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double incrDouble(double a) {
        a = a * 2;
        return a;
    }

    public double incrSalary(double salary) {
        return this.salary *= 2;
    }

    void salaryIncreaseInPercentage(double percent) {
        salary *= (1 + (percent / 100));
    }

}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employeeOne = new Employee("Adam", 100.55);
        Employee employeeTwo = new Employee("Smith", 300.45);


        System.out.println("Adam's salary: " + employeeOne.salary);
        System.out.println("Smith's salary: " + employeeTwo.salary);
        System.out.println();
//        double d = employeeOne.incrDouble(employeeOne.salary);
        employeeOne.incrSalary(employeeOne.salary);
        employeeTwo.salaryIncreaseInPercentage(35);

        System.out.println("Adam's salary: " + employeeOne.salary);
        System.out.println("Smith's salary: " + employeeTwo.salary);
        System.out.println();
        employeeTwo.salaryIncreaseInPercentage(100);
        System.out.println("Smith's salary: " + employeeTwo.salary);


    }
}