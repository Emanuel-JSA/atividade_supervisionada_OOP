package model;

import java.time.LocalDate;

public class Contrato {
    private Long idcontrato;
    private Long funcionario;
    private Long cliente;
    private Long imovel;
    private double valor;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private double percentualMulta;
    private String formaPagamento;
    private Long qtdParcelas;

    public Contrato() {
    }

    public Contrato(Long idcontrato, Long funcionario, Long cliente, Long imovel, double valor, LocalDate dataInicio, LocalDate dataTermino, double percentualMulta, String formaPagamento, Long qtdParcelas) {
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

    public Long getIdcontrato() {
        return idcontrato;
    }

    public void setIdcontrato(Long idcontrato) {
        this.idcontrato = idcontrato;
    }

    public Long getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Long funcionario) {
        this.funcionario = funcionario;
    }

    public Long getCliente() {
        return cliente;
    }

    public void setCliente(Long cliente) {
        this.cliente = cliente;
    }

    public Long getImovel() {
        return imovel;
    }

    public void setImovel(Long imovel) {
        this.imovel = imovel;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public double getPercentualMulta() {
        return percentualMulta;
    }

    public void setPercentualMulta(double percentualMulta) {
        this.percentualMulta = percentualMulta;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Long getQtdParcelas() {
        return qtdParcelas;
    }

    public void setQtdParcelas(Long qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }

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
