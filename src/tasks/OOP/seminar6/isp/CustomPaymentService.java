package tasks.OOP.seminar6.isp;

public class CustomPaymentService extends BasePayamentSrvice implements PayableCreditCard, PayableWebMoney{
    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Custom pay by web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Custom pay by credit card %d\n", amount);
    }

}
