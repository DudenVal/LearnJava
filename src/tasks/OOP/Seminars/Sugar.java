package tasks.OOP.Seminars;

public class Sugar extends Product{

    private int kilograms;

    public int getKilograms() {
        return kilograms;
    }

    public Sugar(String name, double price, int kilograms) {
        super(name, price);
        this.kilograms = kilograms;
    }

    public String displayInfo() {

        return String.format("%s - %s - %f - Количество килограмм: %d",
                brand, name, price, kilograms);
    }
}
