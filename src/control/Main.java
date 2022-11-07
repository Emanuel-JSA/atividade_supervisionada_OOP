package control;

import model.Pessoa;
import persistence.DaoPessoa;
import persistence.DatabaseConnection;
import util.Input;

public class Main {

    private static DaoPessoa daoPessoa = new DaoPessoa();
    
    public static void main(String[] args) {
        DatabaseConnection.getConnection();
        
        listarPessoas();
        cadastrarPessoa();

        System.out.println("\n");
        listarPessoas();

    }
    
    public static void listarPessoas(){
        System.out.println("\nLista de Pessoas");
        for (Pessoa pessoa : daoPessoa.findAll()) {
            System.out.println(""+pessoa.toString());
        }
    }

    public static void cadastrarPessoa(){
        Pessoa p = new Pessoa();
        System.out.println("Qual o seu nome: ");
        p.setNome(Input.nextLine());
        System.out.println("cpf: ");
        p.setCpf(Input.next());

        daoPessoa.save(p);
    }

}
