package control;

import model.Endereco;
import persistence.DaoEndereco;
import util.Input;

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
        daoEndereco.delete(Input.nextInt());
    }

    public void list() {

    }

    public String toString() {
        return "cliente";
    }
}
