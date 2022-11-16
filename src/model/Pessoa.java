package model;

public class Pessoa {
    protected int idpessoa;
    protected String nome;
    protected int cpf;
    protected String dataNasc;
    protected Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(int idpessoa, String nome, int cpf, String dataNasc, Endereco endereco) {
        this.idpessoa = idpessoa;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
    }

    public int getIdPessoa() {
        return idpessoa;
    }

    public void setIdPessoa(int idpessoa) {
        this.idpessoa = idpessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Endereco getEndereco() { return endereco; }

    public void setEndereco(Endereco endereco) { this.endereco = endereco; }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + idpessoa +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNasc=" + dataNasc +
                ", endereco=" + endereco +
                '}';
    }
}
