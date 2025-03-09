public class SystemController {
    public void authenticate(Authenticable authenticable) {
        int password = 1227;
        boolean authenticated = authenticable.authenticate(password);

        if (!authenticated) {
            System.out.println("Can't access the system");
            return;

        }

        System.out.println("Can access the system");
    }
}
