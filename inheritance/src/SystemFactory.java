public class SystemFactory {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setPassword(1227);

        Admin admin = new Admin();
        admin.setPassword(1337); // wrong password

        SystemController systemController = new SystemController();
        systemController.authenticate(manager);
        systemController.authenticate(admin);
    }
}
