package hw.HwOOP2;

public class Plate {
    private int food;
    public Plate(int food) {
        if (food > 15) {
            System.out.println(" Вы позвали своих кошек поесть!");
            this.food = food;
        } else {
            throw new RuntimeException(" Еды меньше 15!");
        }
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
