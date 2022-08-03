package BancoDigital;

public class Contato {
    private String telefone;
    private String celular;
    private String email;

    public Contato(String telefone, String celular, String email) {
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "Contato:\n" +
                "Telefone: " + telefone +
                "\nCelular: " + celular +
                "\nE-Mail: " + email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
