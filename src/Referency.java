public class Referency {
    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.balance = 300;

        Account secondAccount = firstAccount;

        System.out.println("First account has: $" + firstAccount.balance);
        System.out.println("Secound account has: $" + secondAccount.balance);

        secondAccount.balance += 100;

        System.out.println("First account has: $" + firstAccount.balance);
        System.out.println("Secound account has: $" + secondAccount.balance);
    }
}
