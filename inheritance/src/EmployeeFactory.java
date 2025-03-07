public class EmployeeFactory {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Clebson Moura");
        employee.setCpf("123.456.789-00");
        employee.setSalary(1730.00);

        System.out.println("Employee name: " + employee.getName());
        System.out.println("Employee CPF: " + employee.getCpf());
        System.out.println("Employee salary: " + employee.getSalary());
        System.out.println("Employee bonus: " + employee.getBonus());
    }
}
