public abstract class Account {
    private double balance;
    private int agency;
    private int number;
    private Customer owner;

    private static int totalAccounts = 0;

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

    public abstract void deposit(double amount);

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be greater than 0");
            return false;
        }

        if (this.balance < amount) {
            System.out.println("Not enough balance to withdraw");
            return false;
        }

        this.balance -= amount;
        System.out.println("Withdraw successful");

        return true;
    }

    public void transferTo(double amount, Account targetAccount) {
        boolean isWithdrawSuccessful = this.withdraw(amount);

        if (!isWithdrawSuccessful) {
            System.out.println("Not enough balance to transfer");
            return;
        }

        targetAccount.deposit(amount);
        System.out.println("Transfer successful");
    }

    public static int getTotalAccounts() {
        return Account.totalAccounts;
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
