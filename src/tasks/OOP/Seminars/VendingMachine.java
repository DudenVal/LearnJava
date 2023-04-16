package tasks.OOP.Seminars;

import java.util.List;

public class VendingMachine{

    private final List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleofWater(String name, int volume){
        for (Product product: products ) {
            if(product instanceof BottleOfWater) {
                BottleOfWater bottle =  ((BottleOfWater)product);
                if (bottle.name.equals(name) && bottle.getVolume() == volume)
                    return bottle;
            }
        }
        return null;
    }

    // Это особенный автомат, в котором продается 5 кг сахара:D
    public Sugar getSugar(String name, int kilograms){
        for (Product product: products ) {
            if(product instanceof Sugar) {
                Sugar sugar =  ((Sugar)product);
                if (sugar.name.equals(name) && sugar.getKilograms() == kilograms)
                    return sugar;
            }
        }
        return null;
    }

}
