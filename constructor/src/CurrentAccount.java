public class CurrentAccount extends Account {
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
    public boolean withdraw(double amount) {
        double amountWithTax = amount + 0.2;

        return super.withdraw(amountWithTax);
    }
}
