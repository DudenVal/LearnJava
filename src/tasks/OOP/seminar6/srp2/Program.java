package tasks.OOP.seminar6.srp2;

public class Program {

    /**
     * TODO: ДЗ: (программа 1),
     * оптимизировать приложение в соответствии принципом SOLID - SRP
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Укажите заказ: ");


        OrderFromConsole orderCreatorFromConsole = new OrderFromConsole();
        JsonSaver.saveToJson(OrderFromConsole.getOrder());
    }
}
