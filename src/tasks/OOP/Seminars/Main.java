package tasks.OOP.Seminars;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Product product1 = new Product();
////        product1.brand = " ООО Источник";
////        product1.name = "Бутылка с водой";
////        product1.price = 100.15;
//
//        System.out.println(product1.displayInfo());
//
//        Product product2 = new Product("Бутылка с молоком", 120.25);
//        product2.param2 = "..";
//        System.out.println(product2.displayInfo());
//
////        product2.price = -60;
////        product2.name = "_____";
//        System.out.println(product2.displayInfo());
//
//        Product product3 = new Product("__" ,"ss",100);
//        System.out.println(product3.displayInfo());
//        product3.setPrice(10);

        Product bottleOfWater1 = new BottleOfWater("Святой источник", 100, 2);
        Product bottleOfMilk1 = new BottleOfMilk("Кумысыч", 200, 1, 10);
        Product bottleOfWater2 = new BottleOfWater("Архыз", 100, 2);
        Product bottleOfWater3 = new BottleOfWater("Сосновый лес", 100, 2);
        Product bottleOfWater4 = new BottleOfWater("Родник", 100, 2);
        Product sugar1 = new Sugar("Сладко и точка", 53, 5);


        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);
        products.add(bottleOfWater4);
        products.add(sugar1);
        VendingMachine vendingMachine = new VendingMachine(products);

        BottleOfWater bottleOfWaterRes = vendingMachine.getBottleofWater("Архыз", 2);
        if(bottleOfWaterRes != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterRes.displayInfo());
        }
        else{
            System.out.println("Такой бутылки нет в автомате!");
        }

        Sugar sugarRes = vendingMachine.getSugar("Сладко и точка", 5);
        if(sugarRes != null){
            System.out.println("Вы купили: ");
            System.out.println(sugarRes.displayInfo());
        }
        else{
            System.out.println("Странно, но сахара нет в автомате!");
        }

    }
}
