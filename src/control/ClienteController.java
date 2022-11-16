package control;

import model.Pessoa;
import persistence.DaoPessoa;
import util.DateUtils;
import util.Input;

import java.util.ArrayList;

public class ClienteController extends DefaultController{

    DaoPessoa daoPessoa = new DaoPessoa();

    public Pessoa create() {
        Pessoa cliente = new Pessoa();

        System.out.println("Nome do cliente:");
        cliente.setNome(Input.nextLine());

        System.out.println("Cpf do cliente:");
        cliente.setCpf(Input.nextInt());

        System.out.println("Data de nascimento(yyyy-mm-dd):");
        cliente.setDataNasc(Input.nextLine());

        daoPessoa.save(cliente);

        return cliente;
    }

    public void update() {
        Pessoa cliente = new Pessoa();

        System.out.println("Id do cliente:");
        cliente.setIdPessoa(Input.nextInt());

        System.out.println("Nome do cliente:");
        cliente.setNome(Input.nextLine());

        System.out.println("Cpf do cliente:");
        cliente.setCpf(Input.nextInt());

        System.out.println("Data de nascimento(yyyy-mm-dd):");
        cliente.setDataNasc(Input.nextLine());

        daoPessoa.update(cliente);
    }

    public void delete() {
        System.out.println("Id do cliente:");
        Pessoa clienteDeleted = daoPessoa.delete(Input.nextInt());
        if (clienteDeleted != null) {
            System.out.println("Cliente: " + clienteDeleted.getNome() + 
                               " de id: " + clienteDeleted.getIdPessoa() + 
                               " deletado");
        }
    }

    public void list() {
        ArrayList<Pessoa> listClientes = daoPessoa.findAll();
        for (Pessoa cliente : listClientes) {
            System.out.println(cliente.toString());
        }
    }

    public String toString() {
        return "cliente";
    }
}
