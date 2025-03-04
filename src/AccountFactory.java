public class AccountFactory {
    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.balance = 120.50;
        firstAccount.balance += 79.50;

        Account secondAccount = new Account();
        secondAccount.balance = 50.00;

        System.out.println("First account has: $" + firstAccount.balance);
        System.out.println("Secound account has: $" + secondAccount.balance);
    }
}
