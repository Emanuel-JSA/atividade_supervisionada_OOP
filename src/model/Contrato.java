package model;

import java.time.LocalDate;

public class Contrato {
    private int idcontrato;
    private Vendedor funcionario;
    private Pessoa cliente;
    private Imovel imovel;
    private double valor;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private double percentualMulta;
    private String formaPagamento;
    private int qtdParcelas;

    public Contrato() {
    }

    public Contrato(int idcontrato, Vendedor funcionario, Pessoa cliente, Imovel imovel, double valor, LocalDate dataInicio, LocalDate dataTermino, double percentualMulta, String formaPagamento, int qtdParcelas) {
        this.idcontrato = idcontrato;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.imovel = imovel;
        this.valor = valor;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.percentualMulta = percentualMulta;
        this.formaPagamento = formaPagamento;
        this.qtdParcelas = qtdParcelas;
    }

    public int getIdcontrato() { return idcontrato; }

    public void setIdcontrato(int idcontrato) { this.idcontrato = idcontrato; }

    public Vendedor getFuncionario() { return funcionario; }

    public void setFuncionario(Vendedor funcionario) { this.funcionario = funcionario; }

    public Pessoa getCliente() { return cliente; }

    public void setCliente(Pessoa cliente) { this.cliente = cliente; }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) { this.imovel = imovel; }

    public double getValor() { return valor; }

    public void setValor(double valor) { this.valor = valor; }

    public LocalDate getDataInicio() { return dataInicio; }

    public void setDataInicio(LocalDate dataInicio) { this.dataInicio = dataInicio; }

    public LocalDate getDataTermino() { return dataTermino; }

    public void setDataTermino(LocalDate dataTermino) { this.dataTermino = dataTermino; }

    public double getPercentualMulta() { return percentualMulta; }

    public void setPercentualMulta(double percentualMulta) { this.percentualMulta = percentualMulta; }

    public String getFormaPagamento() { return formaPagamento; }

    public void setFormaPagamento(String formaPagamento) { this.formaPagamento = formaPagamento; }

    public int getQtdParcelas() { return qtdParcelas; }

    public void setQtdParcelas(int qtdParcelas) { this.qtdParcelas = qtdParcelas; }

    @Override
    public String toString() {
        return "Contrato{" +
                "idcontrato=" + idcontrato +
                ", funcionario=" + funcionario +
                ", cliente=" + cliente +
                ", imovel=" + imovel +
                ", valor=" + valor +
                ", dataInicio=" + dataInicio +
                ", dataTermino=" + dataTermino +
                ", percentualMulta=" + percentualMulta +
                ", formaPagamento='" + formaPagamento + '\'' +
                ", qtdParcelas=" + qtdParcelas +
                '}';
    }
}
