public class Customer {
    private String name;
    private String cpf;
    private String profession;

    public Customer(String name, String cpf, String profession) {
        this.name = name;
        this.cpf = cpf;
        this.profession = profession;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfession() {
        return this.profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
