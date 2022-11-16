package control;

import persistence.*;
import util.Input;

public class Main {

    public static void main(String[] args) {
        DatabaseConnection.getConnection();

        int op = -1;
        while (op != 0) {
            System.out.println("""
                    1 - Cliente
                    2 - Vendedor
                    3 - Endereco
                    4 - Imovel
                    5 - Contrato
                    0 - sair
                    """);
            op = Input.nextInt();
            switch (op) {
                case 1:
                    ClienteController clienteController = new ClienteController();
                    constructorCliente(clienteController);
                    break;
                case 2:
                    VendedorController vendedorController = new VendedorController();
                    constructorVendedor(vendedorController);
                    break;
                case 3:
                    EnderecoController enderecoController = new EnderecoController();
                    constructorEndereco(enderecoController);
                    break;
                case 4:
                    ImovelController imovelController = new ImovelController();
                    constructorImovel(imovelController);
                    break;
                case 5:
                    ContratoController contratoController = new ContratoController();
                    constructorContrato(contratoController);
                default:
                    if (op != 0) {
                        System.out.println("\nopção inválida!");
                    }
            }
        }
    }

    private static void constructorCliente(ClienteController controller) {
        String controllerName = controller.toString();

        int op = -1;
        while (op != 0) {
            System.out.println("");
            System.out.println("1 - Criar " + controllerName + "\n" +
                               "2 - alterar " + controllerName + "\n" +
                               "3 - deletar " + controllerName + "\n" +
                               "4 - listar " + controllerName);
            System.out.println("0 - sair");

            op = Input.nextInt();
            switch (op) {
                case 1 -> controller.create();
                case 2 -> controller.update();
                case 3 -> controller.delete();
                case 4 -> controller.list();
                default -> System.out.println("Saindo....\n...\n");
            }
        }
    }

    private static void constructorVendedor(VendedorController controller) {
        String controllerName = controller.toString();

        int op = -1;
        while (op != 0) {
            System.out.println("1 - Criar " + controllerName + "\n" +
                               "2 - alterar " + controllerName + "\n" +
                               "3 - deletar " + controllerName + "\n" +
                               "4 - listar " + controllerName);
            System.out.println("0 - sair");

            op = Input.nextInt();
            switch (op) {
                case 1 -> controller.create();
                case 2 -> controller.update();
                case 3 -> controller.delete();
                case 4 -> controller.list();
                default -> System.out.println("Saindo....\n...\n");
            }
        }
    }

    private static void constructorEndereco(EnderecoController controller) {
        String controllerName = controller.toString();

        int op = -1;
        while (op != 0) {
            System.out.println("1 - Criar " + controllerName + "\n" +
                               "2 - alterar " + controllerName + "\n" +
                               "3 - deletar " + controllerName + "\n" +
                               "4 - listar " + controllerName);
            System.out.println("0 - sair");

            op = Input.nextInt();
            switch (op) {
                case 1 -> controller.create();
                case 2 -> controller.update();
                case 3 -> controller.delete();
                case 4 -> controller.list();
                default -> System.out.println("Saindo....\n...\n");
            }
        }
    }

    private static void constructorImovel(ImovelController controller) {
        String controllerName = controller.toString();

        int op = -1;
        while (op != 0) {
            System.out.println("1 - Criar " + controllerName + "\n" +
                               "2 - alterar " + controllerName + "\n" +
                               "3 - deletar " + controllerName + "\n" +
                               "4 - listar " + controllerName);
            System.out.println("0 - sair");

            op = Input.nextInt();
            switch (op) {
                case 1 -> controller.create();
                case 2 -> controller.update();
                case 3 -> controller.delete();
                case 4 -> controller.list();
                default -> System.out.println("Saindo....\n...\n");
            }
        }
    }

    private static void constructorContrato(ContratoController controller) {
        String controllerName = controller.toString();

        int op = -1;
        while (op != 0) {
            System.out.println("1 - Criar " + controllerName + "\n" +
                               "2 - alterar " + controllerName + "\n" +
                               "3 - deletar " + controllerName + "\n" +
                               "4 - listar " + controllerName);
            System.out.println("0 - sair");

            op = Input.nextInt();
            switch (op) {
                case 1 -> controller.create();
                case 2 -> controller.update();
                case 3 -> controller.delete();
                case 4 -> controller.list();
                default -> System.out.println("Saindo....\n...\n");
            }
        }
    }
}
