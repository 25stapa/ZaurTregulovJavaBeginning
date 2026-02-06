package ru.zaurtregulov.javabeginning.lesson05.homework;

public class Employee {
    int id;
    String lastName;
    int age;
    double salary;
    String department;

    Employee(
            int id,
            String lastName,
            int age,
            double salary,
            String department) {
        this.id = id;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    double salaryIncrease(int salaryIncreaseEmployee) {
        return salary *= salaryIncreaseEmployee;
    }

    double salaryIncreaseMethodTwo(Employee employee) {
        return salary = employee.salary * 2;
    }

    double salaryIncreaseInPercentage(double percent) {
        return salary *= (1 + (percent / 100));
    }

}

class EmployeeTest {
    static void main(String[] args) {
        Employee employeeOne = new Employee(1, "Johansson",
                21, 1001, "IT");
        Employee employeeTwo = new Employee(2, "Smith",
                22, 1567, "Transport");

        System.out.println("Salary employeeOne - " + employeeOne.salary + " USD");

        employeeOne.salaryIncrease(2);
        employeeOne.salaryIncreaseMethodTwo(employeeOne);
        employeeOne.salaryIncreaseInPercentage(25);


        System.out.println("Salary employeeOne - " + employeeOne.salary + " USD");

        System.out.println("Salary employeeTwo - " + employeeTwo.salary + " USD");

        employeeTwo.salaryIncrease(2);

        System.out.println("Salary employeeTwo - " + employeeTwo.salary + " USD");
    }
}
