package model;

public class Endereco {
    private Long idendereco;
    private String cidade;
    private Long numero;
    private String rua;

    public Endereco() {
    }

    public Endereco(Long idendereco, String cidade, Long numero, String rua) {
        this.idendereco = idendereco;
        this.cidade = cidade;
        this.numero = numero;
        this.rua = rua;
    }

    public Long getIdendereco() {
        return idendereco;
    }

    public void setIdendereco(Long idendereco) {
        this.idendereco = idendereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
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
