package tasks.OOP.Seminar7;

public class Student implements Observer{

    private String name;
    private double salary;

    public Student(String name) {
        this.name = name;
        salary = 5000;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, Vacancy vacancy) {
        if (this.salary < vacancy.getVacancySalary()){
            System.out.printf("Ñòóäåíò %s >>> Ìíå íóæíà ýòà ðàáîòà! [%s - %s - %f]\n",
                    name, nameCompany, vacancy.getVacancyName(), vacancy.getVacancySalary());
            this.salary = vacancy.getVacancySalary();
        }
        else {
            System.out.printf("Ñòóäåíò %s >>> ß íàéäó ðàáîòó ïîëó÷øå [%s - %s - %f]\n",
                    name, nameCompany, vacancy.getVacancyName(), vacancy.getVacancySalary());
        }
    }
}
