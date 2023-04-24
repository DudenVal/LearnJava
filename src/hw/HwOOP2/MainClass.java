package hw.HwOOP2;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = {
            new Cat("Кратос", 25),
            new Cat("Марс", 15),
            new Cat("Локи", 10),
            new Cat("Тор", 25),
            new Cat("Хеймдаль", 30),
        };

        Plate plate = new Plate(100);
        plate.info();
        Owner owner = new Owner("Светлана", 40);
        while (!owner.checkCats(cats)){
            for (Cat cat:cats) {
                cat.eat(plate);
                plate.info();
            }
            owner.makeFood(plate, owner.checkCats(cats));
        }
        System.out.println("Все коты сыты!");
    }
}
