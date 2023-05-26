package tasks.OOP.seminar6.lsp;

public class Bird {

    private  int flySpeed = 10;

    public  int getFlySpeed(){
        return flySpeed;
    }
    public void fly(){
        System.out.printf("Птица летит со скоростью: %d km/h\n", flySpeed);
    }

}
