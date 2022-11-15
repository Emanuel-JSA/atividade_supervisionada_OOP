package control;

import model.Imovel;
import persistence.DaoEndereco;
import persistence.DaoImovel;
import util.Input;

public class ImovelController extends DefaultController{

    DaoImovel daoImovel = new DaoImovel();
    private Imovel imovel;
    private DaoEndereco daoEndereco;

    public ImovelController(){
        imovel = new Imovel();
        daoEndereco = new DaoEndereco();
    }

    public Imovel create() {

        System.out.println("matricula imovel: ");
        imovel.setMatriculaimovel(Input.next());

        System.out.println("largura: ");
        imovel.setLargura(Input.nextDouble());

        System.out.println("comprimento: ");
        imovel.setComprimento(Input.nextDouble());

        System.out.println("valor: ");
        imovel.setValor(Input.nextDouble());

        System.out.println("id do endereço do imovel:");
        imovel.setEndereco(daoEndereco.findById(Input.nextInt()));

        daoImovel.save(imovel);
        return imovel;
    }

    public void update() {

        System.out.println("Id imovel:");
        imovel.setIdimovel(Input.nextInt());

        System.out.println("matricula imovel: ");
        imovel.setMatriculaimovel(Input.next());

        System.out.println("largura: ");
        imovel.setLargura(Input.nextDouble());

        System.out.println("comprimento: ");
        imovel.setComprimento(Input.nextDouble());

        System.out.println("valor: ");
        imovel.setValor(Input.nextDouble());

        System.out.println("id do endereço do imovel:");
        imovel.setEndereco(daoEndereco.findById(Input.nextInt()));

        daoImovel.update(imovel);
    }

    public void delete() {
        System.out.println("Id do imovel:");
        daoImovel.delete(Input.nextInt());
    }

    public void list() {

    }

    public String toString() {
        return "cliente";
    }
}
