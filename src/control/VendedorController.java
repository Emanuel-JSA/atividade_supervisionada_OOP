package control;

import model.Pessoa;
import model.Vendedor;
import persistence.DaoVendedor;
import util.DateUtils;
import util.Input;

import java.util.ArrayList;

public class VendedorController extends DefaultController {

    DaoVendedor daoVendedor = new DaoVendedor();

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
        Vendedor vendedorDeleted = daoVendedor.delete(Input.nextInt());
        if (vendedorDeleted != null) {
            System.out.println("Vendedor: " + vendedorDeleted.getNome() + " de id: " + vendedorDeleted.getIdvendedor() + " deletado");
        } else {
            System.out.println("falha ao deletar vendedor");
        }
    }

    public void list() {
        ArrayList<Vendedor> vendedores = daoVendedor.findAll();
        for (Vendedor vendedor : vendedores) {
            System.out.println(vendedor.toString());
        }

    }

    public String toString() {
        return "vendedor";
    }
}
