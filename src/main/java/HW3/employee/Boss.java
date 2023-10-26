package HW3.employee;

import java.util.Arrays;

import static java.lang.System.*;

public class Boss extends Employee {

    public Boss(String full_name, String job_title, String telephone, Integer salary, Integer age) {
        super(full_name, job_title, telephone, salary, age);
    }

    public static boolean salaryIncrease(Employee[] employees, int amount) {

        for (int j = 0; j < employees.length; j++)
            if (employees[j] instanceof Boss) {
                return false;
            } else {
                employees[j].setSalary(employees[j].getSalary() + amount);
            }
        return true;
    }
}



