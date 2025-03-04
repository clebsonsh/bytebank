public class AccountFactory {
    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.deposit(120.50);
        boolean isWithdrawSuccessful = firstAccount.withdraw(10.50);
        System.out.println(isWithdrawSuccessful);

        Account secondAccount = new Account();
        secondAccount.deposit(50.00);

        firstAccount.transferTo(200, secondAccount);

        System.out.println("First account has: $" + firstAccount.balance);
        System.out.println("Secound account has: $" + secondAccount.balance);

        System.out.println(firstAccount.agency);
        System.out.println(secondAccount.agency);
    }
}
