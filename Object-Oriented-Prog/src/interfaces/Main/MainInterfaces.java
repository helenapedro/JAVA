package interfaces.Main;

import interfaces.TaxCalculator2024;
import interfaces.TaxCalculator2025;
import interfaces.TaxReport;

public class MainInterfaces {
    public static void main(String[] args) {
        var calculator = new TaxCalculator2024(100_000);
        var report = new TaxReport();
        report.show(calculator);
        report.show(new TaxCalculator2025());

//        report.setCalculator(new TaxCalculator2025());
//        report.show();
    }
}
