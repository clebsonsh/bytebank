public class BonusFactory {
    public static void main(String[] args) {
        Manager rafael = new Manager();
        rafael.setName("Rafael");
        rafael.setSalary(5000.00);

        TechLead clebson = new TechLead();
        clebson.setName("Clebson");
        clebson.setCpf("666.777.888-99");
        clebson.setSalary(2500.00);

        Employee gabriel = new Employee();
        gabriel.setName("Gabriel");
        gabriel.setCpf("123.456.789-00");
        gabriel.setSalary(2000.00);

        BonusController bonusController = new BonusController();
        bonusController.register(rafael);
        bonusController.register(clebson);
        bonusController.register(gabriel);

        System.out.println("Total bonus: " + bonusController.getTotalBonus());
    }
}
