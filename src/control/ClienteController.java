package control;

import model.Pessoa;
import persistence.DaoPessoa;
import util.DateUtils;
import util.Input;

public class ClienteController extends DefaultController{

    DaoPessoa daoPessoa = new DaoPessoa();

    public Pessoa create() {
        Pessoa cliente = new Pessoa();
        EnderecoController enderecoController = new EnderecoController();

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
        daoPessoa.delete(Input.nextInt());
    }

    public void list() {

    }

    public String toString() {
        return "cliente";
    }
}
