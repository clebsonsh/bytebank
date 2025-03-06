public class AccountFactory {
    public static void main(String[] args) {
        Account paulAccount = new Account();
        Customer paul = new Customer();
        paul.name = "Paul";
        paulAccount.owner = paul;
        paulAccount.deposit(120.50);

        paulAccount.withdraw(10.50);

        Account maryAccount = new Account();
        Customer mary = new Customer();
        mary.name = "Mary";
        maryAccount.owner = mary;
        maryAccount.deposit(50.00);

        paulAccount.transferTo(200, maryAccount);

        Account[] accounts = { paulAccount, maryAccount };

        for (Account account : accounts) {
            System.out.println(account.owner.name + " account has: $" + account.balance);
        }
    }
}
