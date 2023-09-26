package roteiro8.parte3;

public class Cliente {
    private String cpf_cnpj;
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    private Veiculo veiculoPessoal;

    public Cliente(String cpf_cnpj, String nome, String endereco, String email, String telefone, Veiculo veiculoPessoal) {
        this.cpf_cnpj = cpf_cnpj;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.veiculoPessoal = veiculoPessoal;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Veiculo getVeiculoPessoal() {
        return veiculoPessoal;
    }

    public void setVeiculoPessoal(Veiculo veiculoPessoal) {
        this.veiculoPessoal = veiculoPessoal;
    }

}