package ru.zaurtregulov.javabeginning.lesson07_1;


public class ThirdClass {
    static void main(String[] args) {
        ru.zaurtregulov.javabeginning.lesson07.Employee employee =
                new ru.zaurtregulov.javabeginning.lesson07.Employee(500);
        System.out.println(employee.salary);
        employee.doubleSalary();
    }
}
