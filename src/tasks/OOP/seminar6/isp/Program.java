package tasks.OOP.seminar6.isp;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<BasePayamentSrvice> services = new ArrayList<>();
        services.add(new InternetPaymentService());
        services.add(new CustomPaymentService());

        for (BasePayamentSrvice service:services) {
            if (service instanceof PayablePhoneNumber)
                ((PayablePhoneNumber)service).payPhoneNumber(1000);
                break;

        }
    }
}
