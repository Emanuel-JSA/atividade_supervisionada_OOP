package control;

import model.Endereco;
import model.Vendedor;
import persistence.DaoEndereco;
import util.Input;

import java.util.ArrayList;

public class EnderecoController extends DefaultController{

    DaoEndereco daoEndereco = new DaoEndereco();

    public Endereco create() {
        Endereco endereco = new Endereco();

        System.out.println("Rua:");
        endereco.setRua(Input.next());

        System.out.println("Numero:");
        endereco.setNumero(Input.nextInt());

        System.out.println("Cidade:");
        endereco.setCidade(Input.nextLine());

        daoEndereco.save(endereco);
        return endereco;
    }

    public void update() {
        Endereco endereco = new Endereco();

        System.out.println("Id do endereco:");
        endereco.setIdendereco(Input.nextInt());

        System.out.println("Cidade:");
        endereco.setCidade(Input.nextLine());

        System.out.println("Numero:");
        endereco.setNumero(Input.nextInt());

        System.out.println("Rua:");
        endereco.setRua(Input.nextLine());

        daoEndereco.update(endereco);
    }

    public void delete() {
        System.out.println("Id do endereco:");
        Endereco enerecoDeleted = daoEndereco.delete(Input.nextInt());
        if (enerecoDeleted != null) {
            System.out.println("Endereco: \n" + enerecoDeleted +
                               " deletado");
        } else {
            System.out.println("falha ao deletar vendedor");
        }
    }

    public void list() {
        ArrayList<Endereco> enderecos = daoEndereco.findAll();
        for (Endereco endereco:
                enderecos) {
            System.out.println(endereco.toString());
        }

    }

    public String toString() {
        return "endereco";
    }
}
