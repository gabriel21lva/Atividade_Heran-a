public class Pessoa {
    
    private String nome;
    private String endereco;
    private String telefone;

    
    public Pessoa() {
        this.nome = "";
        this.endereco = "";
        this.telefone = "";
    }

    
    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    
    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.endereco = "";
        this.telefone = telefone;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String toString() {
        return "Pessoa(" +
                "nome ='" + nome + '\'' +
                ", endereco = '" + endereco + '\'' +
                ", telefone = '" + telefone + '\'' +
                ')';
    }
}
