public class Customer implements Authenticable {
    private final AuthenticationUtil authenticator;

    public Customer() {
        this.authenticator = new AuthenticationUtil();
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
