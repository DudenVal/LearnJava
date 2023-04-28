package tasks.OOP.Seminar3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Sample02 {

    public static Random random = new Random();


    public static Employee generateEmployee(){

        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        String [] comments = new String[] {"Ответственный", "Дружелюбный", "Курящий", "Запойный", "Прогульщик",
                "Лучший", "Общительный", "Приспособленец", "Упрямый", "Стоит своих денег"};

        int birthYear = Sample02.random.nextInt(1980, 2020);

        int [] typeEmployee = new int[] {1, 2};

        int salary = random.nextInt(900, 1500);
        int salaryIndex = random.nextInt(28, 31);

        int rate = Sample02.random.nextInt(200, 500);
        int hoursWorking = Sample02.random.nextInt(3, 8);
        int daysWorking = Sample02.random.nextInt(3, 20);
        double salaryFreeLancer = rate * hoursWorking * daysWorking;

        int typeEmp = typeEmployee[random.nextInt(2)];

        if (typeEmp == 1) {
            return new Worker(names[random.nextInt(10)], surnames[random.nextInt(10)], birthYear, salary*salaryIndex, comments[random.nextInt(10)]);
        }
        else {
            return new Freelancer(names[random.nextInt(10)], surnames[random.nextInt(10)], birthYear, salaryFreeLancer, comments[random.nextInt(10)]);
        }
    }



    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++){
            employees[i] = generateEmployee();
        }

        for (Employee employee: employees){
            System.out.println(employee);
        }

        Arrays.sort(employees, new BirthYearComparatorR());

        System.out.println("\n*** Отсортированный массив сотрудников: ***\n");

        for (Employee employee: employees){
            System.out.println(employee);
        }

    }
}


class BirthYearComparatorR implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.birthYear, o2.birthYear);
    }
}



abstract class Employee {

    protected String firstName;
    protected String surName;
    protected int birthYear;
    protected double salary;
    protected String comment;

    public Employee(String firstName, String surName, int birthYear, double salary, String comment) {
        this.firstName = firstName;
        this.surName = surName;
        this.birthYear = birthYear;
        this.salary = salary;
        this.comment = comment;
    }

    public abstract double calculateSalary();


    @Override
    public String toString() {
        return String.format("Сотрудник: %s %s; Год рождения: %s; Ставка: %.2f, Среднемес. зп: " +
                "%.2f; Комментарий: %s\n", surName, firstName, birthYear, salary, calculateSalary(), comment);
    }

}

class Worker extends Employee {

    public Worker(String firstName, String surName, int birthYear, double salary, String comment) {
        super(firstName, surName, birthYear, salary, comment);
    }

    @Override
    public double calculateSalary() {
        int salaryRate = Sample02.random.nextInt(900, 1500);
        int salaryIndex = Sample02.random.nextInt(28, 31);
        return salary = salaryRate * salaryIndex;
    }

    @Override
    public String toString() {
        return String.format("Рабочий: %s %s; Год рождения: %s; Ставка: %.2f, Среднемес. зп: " +
                "%.2f; Комментарий: %s\n", surName, firstName, birthYear, salary, calculateSalary(), comment);
    }

}

class Freelancer extends Employee {
    public Freelancer(String firstName, String surName, int birthYear, double salary, String comment) {
        super(firstName, surName, birthYear, salary, comment);
    }

    @Override
    public double calculateSalary() {

        int rate = Sample02.random.nextInt(200, 500);
        int hoursWorking = Sample02.random.nextInt(3, 8);
        int daysWorking = Sample02.random.nextInt(3, 20);
        return salary = rate * hoursWorking * daysWorking;
    }

    @Override
    public String toString() {
        return String.format("Фрилансер: %s %s; Год рождения: %s; Ставка: %.2f, Среднемес. зп: " +
                "%.2f; Комментарий: %s\n", surName, firstName, birthYear, salary, calculateSalary(), comment);
    }

}
