public class AccountFactory {
    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.deposit(120.50);
        firstAccount.withdraw(10.50);

        Account secondAccount = new Account();
        secondAccount.deposit(50.00);

        firstAccount.transferTo(secondAccount, 20);

        System.out.println("First account has: $" + firstAccount.balance);
        System.out.println("Secound account has: $" + secondAccount.balance);

        System.out.println(firstAccount.agency);
        System.out.println(secondAccount.agency);
    }
}
