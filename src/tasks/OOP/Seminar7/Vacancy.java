package tasks.OOP.Seminar7;

public class Vacancy {

    private String vacancyName;
    private double vacancySalary;


    public String getVacancyName() {
        return vacancyName;
    }

    public double getVacancySalary() {
        return vacancySalary;
    }



    public Vacancy(String vacancyName, double vacancySalary) {
        this.vacancyName = vacancyName;
        this.vacancySalary = vacancySalary;
    }
}
