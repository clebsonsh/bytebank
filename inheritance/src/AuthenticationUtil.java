public class AuthenticationUtil {
    private int password;
    
    public boolean authenticate(int password) {
        if (this.password == password) {
            System.out.println("Access allowed!");
            return true;
        } else {
            System.out.println("Access denied!");
            return false;
        }
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
