public class AccountFactory {
    public static void main(String[] args) {
        Account paulAccount = new Account(42, 1337, new Customer("Paul", "123.456.789-00", "Developer"));
        paulAccount.deposit(120.50);

        paulAccount.withdraw(10.50);

        Account maryAccount = new Account(42, 1338, new Customer("Mary", "987.654.321-00", "Designer"));
        maryAccount.deposit(50.00);

        paulAccount.transferTo(200, maryAccount);

        Account[] accounts = { paulAccount, maryAccount };

        for (Account account : accounts) {
            System.out.println(account.getOwner().getName() + " account has: $" + account.getBalance());
        }

        System.out.println("Total accounts: " + Account.getTotalAccounts());
    }
}
