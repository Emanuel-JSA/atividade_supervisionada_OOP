package model;

public class Vendedor {
    private Long idvendedor;
    private double percentualcomissao;
    private double salario;

    public Vendedor() {
    }

    public Vendedor(Long idvendedor, double percentualcomissao, double salario) {
        this.idvendedor = idvendedor;
        this.percentualcomissao = percentualcomissao;
        this.salario = salario;
    }

    public Long getIdvendedor() {
        return idvendedor;
    }

    public void setIdvendedor(Long idvendedor) {
        this.idvendedor = idvendedor;
    }

    public double getPercentualcomissao() {
        return percentualcomissao;
    }

    public void setPercentualcomissao(double percentualcomissao) {
        this.percentualcomissao = percentualcomissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "idvendedor=" + idvendedor +
                ", percentualcomissao=" + percentualcomissao +
                ", salario=" + salario +
                '}';
    }
}
