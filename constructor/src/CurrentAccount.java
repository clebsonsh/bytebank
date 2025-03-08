public class CurrentAccount extends Account {
    public CurrentAccount(int agency, int number, Customer owner) {
        super(agency, number, owner);
    }

    @Override
    public boolean withdraw(double amount) {
        double amountWithTax = amount + 0.2;

        return super.withdraw(amountWithTax);
    }
}
