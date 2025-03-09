public class TaxController {
    private double totalTax;

    public void register(Taxable taxable) {
        double tax = taxable.getTax();

        this.totalTax += tax;
    }

    public double getTotalTax() {
        return this.totalTax;
    }
}
