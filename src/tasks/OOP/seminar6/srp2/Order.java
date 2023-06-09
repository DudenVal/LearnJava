package tasks.OOP.seminar6.srp2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order {

    private String clientName;
    private String product;
    private int qnt;
    private double price;

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public double getPrice() {
        return price;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public void setPrice(double price) {
        this.price = price;
    }

//    public void inputFromConsole(){
//        clientName = prompt("Client name: ");
//        product = prompt("Product: ");
//        qnt = Integer.parseInt(prompt("Quality: "));
//        price = Integer.parseInt(prompt("Price: "));
//    }
//
//    private String prompt(String message) {
//        Scanner in = new Scanner(System.in);
//        System.out.println(message);
//        return  in.nextLine();
//    }
//
//    public void saveToJson() {
//        String fileName = "order.json";
//        try (FileWriter writer = new FileWriter(fileName, false)) {
//            writer.write("{\n");
//            writer.write("\"clientName\":\""+ clientName + "\",\n");
//            writer.write("\"product\":\""+product+"\",\n");
//            writer.write("\"qnt\":"+qnt+",\n");
//            writer.write("\"price\":"+price+"\n");
//            writer.write("}\n");
//            writer.flush();
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }

}
