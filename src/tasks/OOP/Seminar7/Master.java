package tasks.OOP.Seminar7;

public class Master implements Observer {

    private String name;
    private double salary;

    public Master(String name) {
        this.name = name;
        salary = 80000;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, Vacancy vacancy) {
        if (this.salary < vacancy.getVacancySalary()) {
            System.out.printf("Ñïåöèàëèñò %s >>> Ìíå íóæíà ýòà ðàáîòà! [%s - %s - %f]\n",
                    name, nameCompany, vacancy.getVacancyName(), vacancy.getVacancySalary());
            this.salary = vacancy.getVacancySalary();
        } else {
            System.out.printf("Ñïåöèàëèñò %s >>> ß íàéäó ðàáîòó ïîëó÷øå [%s - %s - %f]\n",
                    name, nameCompany, vacancy.getVacancyName(), vacancy.getVacancySalary());
        }
    }
}
