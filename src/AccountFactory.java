public class AccountFactory {
    public static void main(String[] args) {
        Account paulAccount = new Account();
        Customer paul = new Customer();
        paul.setName("Paul");
        paulAccount.setOwner(paul);
        paulAccount.deposit(120.50);

        paulAccount.withdraw(10.50);

        Account maryAccount = new Account();
        maryAccount.setOwner(new Customer());
        maryAccount.getOwner().setName("Mary");
        maryAccount.deposit(50.00);

        paulAccount.transferTo(200, maryAccount);

        Account[] accounts = { paulAccount, maryAccount };

        for (Account account : accounts) {
            System.out.println(account.getOwner().getName() + " account has: $" + account.getBalance());
        }
    }
}
