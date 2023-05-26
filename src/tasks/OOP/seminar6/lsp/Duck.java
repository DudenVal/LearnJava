package tasks.OOP.seminar6.lsp;

public class Duck extends Bird{

    @Override
    public void fly() {
        System.out.printf("Утка летит со скоростью: %d km/h\n", 8);
    }
}
