public class Referency {
    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.deposit(300);

        Account secondAccount = firstAccount;

        System.out.println("First account has: $" + firstAccount.getBalance());
        System.out.println("Secound account has: $" + secondAccount.getBalance());

        secondAccount.deposit(100);

        System.out.println("First account has: $" + firstAccount.getBalance());
        System.out.println("Secound account has: $" + secondAccount.getBalance());
    }
}
