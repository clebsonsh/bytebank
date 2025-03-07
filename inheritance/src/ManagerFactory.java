public class ManagerFactory {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setName("Uilliam");
        manager.setCpf("987.654.321-00");
        manager.setSalary(5000.00);
        manager.setPassword(1234);

        System.out.println("Manager name: " + manager.getName());
        System.out.println("Manager CPF: " + manager.getCpf());
        System.out.println("Manager salary: " + manager.getSalary());
        System.out.println("Manager bonus: " + manager.getBonus());

        boolean authenticated = manager.authenticate(1234);
        System.out.println("Authenticated: " + authenticated);
    }
}
