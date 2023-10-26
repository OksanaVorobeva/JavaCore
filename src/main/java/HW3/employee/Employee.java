package HW3.employee;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String full_name;
    private String job_title;
    private String telephone;
    private Integer salary;
    private Integer age;

    public Employee() {
    }

    public Employee(String full_name, String job_title, String telephone, Integer salary, Integer age) {
        this.full_name = full_name;
        this.job_title = job_title;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public String getFull_name() {
        return full_name;
    }

    public String getJob_title() {
        return job_title;
    }

    public String getTelephone() {
        return telephone;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("ФИО:  ");
        sb.append(full_name);
        sb.append(",  ");
        sb.append("Должность: ");
        sb.append(job_title);
        sb.append(",  ");
        sb.append("Телефон:  ");
        sb.append(telephone);
        sb.append(",  ");
        sb.append("Зарплата:  ");
        sb.append(salary);
        sb.append(",  ");
        sb.append("Возраст:  ");
        sb.append(age);
        sb.append(",  ");

        return sb.toString();

    }

    public void comparisonDates(String d1, String d2) {
        String pattern = "MM-dd-yyyy";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

        LocalDate date1 = LocalDate.parse(d1, formatter);
        LocalDate date2 = LocalDate.parse(d2, formatter);

        if (date1.isAfter(date2)) {
            System.out.printf("%s is after %s", d1, d2);
        } else if (date1.isBefore(date2)) {
            System.out.printf("%s is before %s", d1, d2);
        } else if (date1.isEqual(date2)) {
            System.out.print("Both dates are equal");
        }
    }
}


