public class TaxFactory {
    public static void main(String[] args) {
        Customer customer = new Customer("Clebson", "111.222.333.-44", "Developer");
        CurrentAccount currentAccount = new CurrentAccount(42, 1337, customer);
        currentAccount.deposit(100);

        Insurance insurance = new Insurance();

        TaxController taxController = new TaxController();
        taxController.register(currentAccount);
        taxController.register(insurance);

        System.out.println(taxController.getTotalTax());
    }
}
