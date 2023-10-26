package HW3;

import HW3.employee.Boss;
import HW3.employee.Employee;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Employee peter = new Employee("Иванов Петр Иванович", "Руководитель отдела", "353553535", 100000, 48);
        Employee nikolay = new Employee("Петров Николай Иванович", "Главный менеджер", "154765876", 80000, 35);
        Employee eugene = new Employee("Сидоров Евгений Николаевич", "Менеджер", "984532176", 60000, 30);
        Employee paul = new Employee("Колесников Павел Андреевич", "Менеджер", "907514263", 60000, 48);
        Employee andrey = new Employee("Васнецов Андрей Петрович", "Менеджер", "817263047", 60000, 25);
        Employee boss = new Boss("Иванов Григорий Евгеньевич", "Директор", "387454287", 150000, 50);

        Employee[] employees = new Employee[6];
        employees[0] = peter;
        employees[1] = nikolay;
        employees[2] = eugene;
        employees[3] = paul;
        employees[4] = andrey;
        employees[5] = boss;

        Boss.salaryIncrease(employees, 5000);
        System.out.println(Arrays.toString(employees));

        Employee employee = new Employee();
        employee.comparisonDates("10-20-2016","10-12-2015");
    }
}





