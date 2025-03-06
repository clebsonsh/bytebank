public class Account {
    private double balance;
    private int agency;
    private int number;
    private Customer owner;

    public double getBalance() {
        return this.balance;
    }

    public int getAgency() {
        return this.agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Customer getOwner() {
        return this.owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

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
