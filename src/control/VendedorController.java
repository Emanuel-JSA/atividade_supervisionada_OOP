package control;

import model.Pessoa;
import model.Vendedor;
import persistence.DaoVendedor;
import util.DateUtils;
import util.Input;

public class VendedorController extends DefaultController{

    DaoVendedor daoVendedor;

    public Vendedor create() {
        Vendedor vendedor = new Vendedor();

        System.out.println("Nome do vendedor:");
        vendedor.setNome(Input.nextLine());

        System.out.println("Cpf do vendedor:");
        vendedor.setCpf(Input.nextInt());

        System.out.println("Data de nascimento(yyyy-mm-dd):");
        vendedor.setDataNasc(Input.nextLine());

        System.out.println("Percentual de comissão do vendedor:");
        vendedor.setPercentualcomissao(Input.nextDouble());

        System.out.println("Salario:");
        vendedor.setSalario(Input.nextDouble());

        daoVendedor.save(vendedor);

        return vendedor;
    }

    public void update() {
        Vendedor vendedor = new Vendedor();

        System.out.println("Id do vendedor:");
        vendedor.setIdvendedor(Input.nextInt());

        System.out.println("Nome do vendedor:");
        vendedor.setNome(Input.nextLine());

        System.out.println("Cpf do vendedor:");
        vendedor.setCpf(Input.nextInt());

        System.out.println("Data de nascimento(yyyy-mm-dd):");
        vendedor.setDataNasc(Input.nextLine());

        System.out.println("Percentual de comissão do vendedor:");
        vendedor.setPercentualcomissao(Input.nextDouble());

        System.out.println("Salario:");
        vendedor.setSalario(Input.nextDouble());

        daoVendedor.update(vendedor);
    }

    public void delete() {
        System.out.println("Id do vendedor:");
        daoVendedor.delete(Input.nextInt());
    }

    public void list() {

    }

    public String toString() {
        return "cliente";
    }
}
