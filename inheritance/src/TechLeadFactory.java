public class TechLeadFactory {
    public static void main(String[] args) {
        TechLead techLead = new TechLead();
        techLead.setName("Clebson Moura");
        techLead.setCpf("123.456.789-00");

        System.out.println("Employee name: " + techLead.getName());
        System.out.println("Employee CPF: " + techLead.getCpf());
        System.out.println("Employee bonus: " + techLead.getBonus());
    }
}
