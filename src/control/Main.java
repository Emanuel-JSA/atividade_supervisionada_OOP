package control;

import model.Contrato;
import model.Pessoa;
import persistence.*;
import util.Input;

public class Main {

    private static DaoPessoa daoPessoa = new DaoPessoa();
    private static DaoEndereco daoEndereco = new DaoEndereco();
    private static DaoImovel daoImovel = new DaoImovel();
    private static DaoVendedor daoVendedor = new DaoVendedor();
    private static DaoContrato daoContrato = new DaoContrato();

    public static void main(String[] args) {
        DatabaseConnection.getConnection();

//        cadastrarPessoa();

        System.out.println("\n");
        listarPessoas();
        listarContrato();

    }

    private static void listarContrato() {
        System.out.println("\nLista de contratos");
        for (Contrato contrato : daoContrato.findAll()) {
            System.out.println("" + contrato.toString());
        }
    }

    public static void listarPessoas() {
        System.out.println("\nLista de Pessoas");
        for (Pessoa pessoa : daoPessoa.findAll()) {
            System.out.println("" + pessoa.toString());
        }
    }

    public static void cadastrarPessoa() {
        Pessoa p = new Pessoa();
        System.out.println("Qual o seu nome: ");
        p.setNome(Input.nextLine());
        System.out.println("cpf: ");
        p.setCpf(Input.nextInt());

        daoPessoa.save(p);
    }

}
