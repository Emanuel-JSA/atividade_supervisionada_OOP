package model;

public class Endereco {
    private int idendereco;
    private String cidade;
    private int numero;
    private String rua;

    public Endereco() {
    }

    public Endereco(int idendereco, String cidade, int numero, String rua) {
        this.idendereco = idendereco;
        this.cidade = cidade;
        this.numero = numero;
        this.rua = rua;
    }

    public int getIdendereco() {
        return idendereco;
    }

    public void setIdendereco(int idendereco) {
        this.idendereco = idendereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "idendereco=" + idendereco +
                ", cidade='" + cidade + '\'' +
                ", numero=" + numero +
                ", rua='" + rua + '\'' +
                '}';
    }
}
