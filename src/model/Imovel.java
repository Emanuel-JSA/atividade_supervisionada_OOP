package model;

public class Imovel {
    private Long idimovel;
    private String matriculaimovel;
    private Long proprietario;
    private Long endereco;
    private String tipo;
    private double comprimento;
    private double largura;
    private double valor;
    private double cadpro;

    public Imovel() {
    }

    public Imovel(Long idimovel, String matriculaimovel, Long proprietario, Long endereco, String tipo, double comprimento, double largura, double valor, double cadpro) {
        this.idimovel = idimovel;
        this.matriculaimovel = matriculaimovel;
        this.proprietario = proprietario;
        this.endereco = endereco;
        this.tipo = tipo;
        this.comprimento = comprimento;
        this.largura = largura;
        this.valor = valor;
        this.cadpro = cadpro;
    }

    public Long getIdimovel() {
        return idimovel;
    }

    public void setIdimovel(Long idimovel) {
        this.idimovel = idimovel;
    }

    public String getMatriculaimovel() {
        return matriculaimovel;
    }

    public void setMatriculaimovel(String matriculaimovel) {
        this.matriculaimovel = matriculaimovel;
    }

    public Long getProprietario() {
        return proprietario;
    }

    public void setProprietario(Long proprietario) {
        this.proprietario = proprietario;
    }

    public Long getEndereco() {
        return endereco;
    }

    public void setEndereco(Long endereco) {
        this.endereco = endereco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getCadpro() {
        return cadpro;
    }

    public void setCadpro(double cadpro) {
        this.cadpro = cadpro;
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "idimovel=" + idimovel +
                ", matriculaimovel='" + matriculaimovel + '\'' +
                ", proprietario=" + proprietario +
                ", endereco=" + endereco +
                ", tipo='" + tipo + '\'' +
                ", comprimento=" + comprimento +
                ", largura=" + largura +
                ", valor=" + valor +
                ", cadpro=" + cadpro +
                '}';
    }
}
