package tasks.OOP.seminar6.dip;
import java.util.*;

public class Report {

    private  List<ReportItem> items; // отчетные данные

    // Рассчет отчетных данных

    void calculate(){
        items = new ArrayList<ReportItem>();
        items.add(new ReportItem("First",(float) 5));
        items.add(new ReportItem("Second",(float) 6));
    }
    public void output(Print printService){
        if (printService != null){
            printService.print(items);
        }
        PrintReport printReport = new PrintReport();
        printReport.output(items);
    }

}
