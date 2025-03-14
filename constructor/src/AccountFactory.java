public class AccountFactory {
    public static void main(String[] args) {
        Customer paloma = new Customer("Paloma", "111.222.333-44", "Teacher");
        SavingAccount palomaAccount = new SavingAccount(42, 1, paloma);
        palomaAccount.deposit(100);

        Customer clebson = new Customer("Clebson", "777.888.999-00", "Developer");
        CurrentAccount clebsonAccount = new CurrentAccount(42, 2, clebson);
        clebsonAccount.deposit(200);

        try {
            clebsonAccount.transferTo(200, palomaAccount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Ex: " + e.getMessage());
        }

        System.out.println(clebsonAccount.getOwner().getName() + " Account Balance: " + clebsonAccount.getBalance());
        System.out.println(palomaAccount.getOwner().getName() + " Account Balance: " + palomaAccount.getBalance());
    }
}
