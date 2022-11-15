package model;

public class Imovel {
    protected int idimovel;
    protected String matriculaimovel;
    protected Pessoa proprietario;
    protected String tipo;
    protected double comprimento;
    protected double largura;
    protected double valor;
    protected double cadpro;
    protected Endereco endereco;

    public Imovel() {
    }

    public Imovel(int idimovel, String matriculaimovel, Pessoa proprietario, String tipo, double comprimento, double largura, double valor, double cadpro, Endereco endereco) {
        this.idimovel = idimovel;
        this.matriculaimovel = matriculaimovel;
        this.proprietario = proprietario;
        this.tipo = tipo;
        this.comprimento = comprimento;
        this.largura = largura;
        this.valor = valor;
        this.cadpro = cadpro;
        this.endereco = endereco;
    }

    public int getIdimovel() {
        return idimovel;
    }

    public void setIdimovel(int idimovel) {
        this.idimovel = idimovel;
    }

    public String getMatriculaimovel() {
        return matriculaimovel;
    }

    public void setMatriculaimovel(String matriculaimovel) {
        this.matriculaimovel = matriculaimovel;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
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

    public Endereco getEndereco() {
        return this.endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double calcularArea(){ return 0; };

    @Override
    public String toString() {
        return "Imovel{" +
                "idimovel=" + idimovel +
                ", matriculaimovel='" + matriculaimovel + '\'' +
                ", proprietario=" + proprietario +
                ", tipo='" + tipo + '\'' +
                ", comprimento=" + comprimento +
                ", largura=" + largura +
                ", valor=" + valor +
                ", cadpro=" + cadpro +
                ", endereco=" + endereco +
                '}';
    }
}
