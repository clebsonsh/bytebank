public class Account {
    double balance;
    int agency = 42;
    int number;
    String owner;

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit successful");
    }

    public boolean withdraw(double amount) {
        if (this.balance < amount) {
            System.out.println("Not enough balance to withdraw");
            return false;
        }

        this.balance -= amount;
        System.out.println("Withdraw successful");

        return true;
    }

    public boolean transferTo(double amount, Account targetAccount) {
        boolean isWithdrawSuccessful = this.withdraw(amount);

        if (!isWithdrawSuccessful) {
            System.out.println("Not enough balance to transfer");
            return false;
        }

        targetAccount.deposit(amount);
        System.out.println("Transfer successful");

        return true;
    }
}
