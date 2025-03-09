public class Manager extends AuthenticableEmployee{
    @Override
    public double getBonus() {
        return super.getSalary();
    }
}
