package model;

import java.time.LocalDate;

public class Pessoa {
    private int idpessoa;
    private String nome;
    private int cpf;
    private LocalDate dataNasc;
    private Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(int idpessoa, String nome, int cpf, LocalDate dataNasc, Endereco endereco) {
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

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
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
