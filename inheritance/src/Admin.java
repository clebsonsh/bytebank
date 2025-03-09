public class Admin extends Employee implements Authenticable {
    private final AuthenticationUtil authenticator;

    public Admin() {
        this.authenticator = new AuthenticationUtil();
    }

    @Override
    public double getBonus() {
        return 50;
    }

    @Override
    public boolean authenticate(int password) {
        return this.authenticator.authenticate(password);
    }

    @Override
    public void setPassword(int password) {
        this.authenticator.setPassword(password);
    }
}
