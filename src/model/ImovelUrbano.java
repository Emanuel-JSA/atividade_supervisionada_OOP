package model;

public abstract class ImovelUrbano extends Imovel{

    protected abstract double calcularIPTU();

    public ImovelUrbano() {
    }

    @Override
    public double calcularArea() {
        return largura * comprimento;
    }
}
