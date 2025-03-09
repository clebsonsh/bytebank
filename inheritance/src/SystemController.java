public class SystemController {
    public void authenticate(AuthenticableEmployee authenticableEmployee) {
        int password = 1227;
        boolean authenticated = authenticableEmployee.authenticate(password);

        if (!authenticated) {
            System.out.println("Can't access the system");
            return;

        }

        System.out.println("Can access the system");
    }
}
