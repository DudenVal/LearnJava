package tasks.OOP.seminar6.srp2;

import java.util.Scanner;

public class OrderFromConsole {
    static Order order;

    public OrderFromConsole() {
        this.order = new Order("","",0,0);
        inputFromConsole(order);
    }

    public void inputFromConsole(Order order){
        order.setClientName(prompt("Client name: ")) ;
        order.setProduct(prompt("Product: "));
        order.setQnt(Integer.parseInt(prompt("Quantity: ")));
        order.setPrice(Integer.parseInt(prompt("Price: ")));
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public static Order getOrder() {
        return order;
    }
}
