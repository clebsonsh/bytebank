public abstract class Account {
    private static int totalAccounts = 0;
    private double balance;
    private int agency;
    private int number;
    private Customer owner;

    public Account(int agency, int number, Customer owner) {
        if (agency <= 0) {
            System.out.println("Agency must be greater than 0");
            return;
        }

        if (number <= 0) {
            System.out.println("Account number must be greater than 0");
            return;
        }

        this.agency = agency;
        this.number = number;
        this.owner = owner;

        Account.totalAccounts++;
    }

    public static int getTotalAccounts() {
        return Account.totalAccounts;
    }

    public abstract void deposit(double amount);

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new InsufficientBalanceException("Withdraw amount must be greater than 0");
        }

        if (this.balance < amount) {
            throw new InsufficientBalanceException("Not enough balance to withdraw");
        }

        this.balance -= amount;
    }

    public void transferTo(double amount, Account targetAccount) throws InsufficientBalanceException {
        this.withdraw(amount);
        targetAccount.deposit(amount);
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAgency() {
        return this.agency;
    }

    public int getNumber() {
        return this.number;
    }

    public Customer getOwner() {
        return this.owner;
    }
}
