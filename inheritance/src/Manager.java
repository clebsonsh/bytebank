public class Manager extends Employee implements Authenticable {
    private final AuthenticationUtil authenticator;

    public Manager() {
        this.authenticator = new AuthenticationUtil();
    }

    @Override
    public double getBonus() {
        return super.getSalary();
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
