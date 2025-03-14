public class CurrentAccount extends Account implements Taxable {
    public CurrentAccount(int agency, int number, Customer owner) {
        super(agency, number, owner);
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than 0");
            return;
        }

        super.setBalance(super.getBalance() + amount);
        System.out.println("Deposit successful");
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        double amountWithTax = amount + 0.2;

        super.withdraw(amountWithTax);
    }

    @Override
    public double getTax() {
        return super.getBalance() * 0.01;
    }
}
