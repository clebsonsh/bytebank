public class Account {
    double balance;
    int agency = 42;
    int number;
    String owner;

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void transferTo(Account targetAccount, double amount) {
        this.withdraw(amount);
        targetAccount.deposit(amount);
    }
}
