public class BonusController {
    private double totalBonus;

    public void register(Employee employee) {
        this.totalBonus += employee.getBonus();
    }

    public double getTotalBonus() {
        return this.totalBonus;
    }

}
