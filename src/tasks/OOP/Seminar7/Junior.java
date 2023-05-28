package tasks.OOP.Seminar7;

public class Junior implements Observer{
    private String name;
    private double salary;

    public Junior(String name) {
        this.name = name;
        salary = 50000;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, Vacancy vacancy) {
        if (this.salary < vacancy.getVacancySalary()){
            System.out.printf("Âûïóñêíèê GB %s >>> Ìíå íóæíà ýòà ðàáîòà! [%s - %s - %f]\n",
                    name, nameCompany, vacancy.getVacancyName(), vacancy.getVacancySalary());
            this.salary = vacancy.getVacancySalary();
        }
        else {
            System.out.printf("Âûïóñêíèê GB %s >>> ß íàéäó ðàáîòó ïîëó÷øå [%s - %s - %f]\n",
                    name, nameCompany, vacancy.getVacancyName(), vacancy.getVacancySalary());
        }
    }
}
