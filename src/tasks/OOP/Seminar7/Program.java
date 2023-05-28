package tasks.OOP.Seminar7;

public class Program {

    public static void main(String[] args) {
        JobAgency jobAgency = new JobAgency();

        Company geekBrains = new Company("GeekBrains", 60000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);

        Master ivanov = new Master("Ivanov");
        Master petrov = new Master("Petrov");
        Student sidorov = new Student("Sidorov");
        Junior Vasilev = new Junior("Sabakevich");

        Vacancy frontendDev = new Vacancy("FrontendDev", 110000);
        Vacancy backendDev = new Vacancy("BackendDev", 130000);
        Vacancy teacherJava = new Vacancy("TeacherJava", 70000);

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(Vasilev);

        for (int i = 0; i < 2; i++){
            geekBrains.needEmployee(teacherJava);
            google.needEmployee(backendDev);
            yandex.needEmployee(frontendDev);
        }
    }
}
