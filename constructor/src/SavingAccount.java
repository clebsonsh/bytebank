public class SavingAccount extends Account {
    public SavingAccount(int agency, int number, Customer owner) {
        super(agency, number, owner);
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than 0");
            return;
        }

        super.setBalance(super.getBalance() + amount + 0.02);
        System.out.println("Deposit successful");
    }
}
