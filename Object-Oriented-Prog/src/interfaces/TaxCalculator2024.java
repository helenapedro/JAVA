package interfaces;

public class TaxCalculator2024
        extends AbstractTaxCalculator {
    private double taxableIncome;

    public TaxCalculator2024(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        getTaxableIncome(50000, 10000);
        return taxableIncome * 0.3;
    }
}
