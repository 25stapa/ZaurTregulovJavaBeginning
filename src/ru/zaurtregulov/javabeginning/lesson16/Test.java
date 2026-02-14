package ru.zaurtregulov.javabeginning.lesson16;

public class Test {

}

class Employee {

    double salary;
    boolean isManager;

    public Employee(double salary, boolean isManager) {
        this.salary = salary;
        this.isManager = isManager;
    }
}

class TestEmployee {
    static void main() {

        Employee employee = new Employee(100.5, true);
        // System.out.println(employee.isManager + employee.salary); // java: bad operand types for binary operator '+'
        // first type:  boolean
        // second type: double

        System.out.println("Is he a manager? - \t" + employee.isManager +
                "\nHis salary is - " + employee.salary);

    }
}
