package VIEW;

import DAO.Imovel_DAO;
import MODEL.Imovel;

import java.util.List;
import java.util.Scanner;

public abstract class MenuGestaoImoveis {

    private static final Imovel_DAO imovelDAO = new Imovel_DAO();
    private static final Scanner scanner = new Scanner(System.in);

    public static void exibirMenu() {
        int opcao;
        do {
            System.out.println("==== Menu Gestão de Imóveis ====");
            System.out.println("1. Adicionar Imóvel");
            System.out.println("2. Listar Todos os Imóveis");
            System.out.println("3. Buscar Imóvel por ID");
            System.out.println("4. Atualizar Imóvel");
            System.out.println("5. Excluir Imóvel");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarImovel();
                    break;
                case 2:
                    listarTodosImoveis();
                    break;
                case 3:
                    buscarImovelPorId();
                    break;
                case 4:
                    atualizarImovel();
                    break;
                case 5:
                    excluirImovel();
                    break;
                case 0:
                    System.out.println("Saindo do Menu. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);
    }

    private static void adicionarImovel() {
        System.out.println("==== Adicionar Imóvel ====");
        System.out.print("Matrícula: ");
        String matricula = scanner.next();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();  // Consumir a quebra de linha pendente
        endereco = scanner.nextLine();  // Agora obter a entrada correta para o endereço
        System.out.print("Última Leitura: ");
        int ultimaLeitura = scanner.nextInt();
        System.out.print("Penúltima Leitura: ");
        int penultimaLeitura = scanner.nextInt();

        Imovel novoImovel = new Imovel(0, matricula, endereco, ultimaLeitura, penultimaLeitura);
        imovelDAO.adicionarImovel(novoImovel);
        System.out.println("Imóvel adicionado com sucesso!");
    }


    private static void listarTodosImoveis() {
        System.out.println("==== Listar Todos os Imóveis ====");
        List<Imovel> imoveis = imovelDAO.obterTodosImoveis();

        if (imoveis.isEmpty()) {
            System.out.println("Nenhum imóvel cadastrado.");
        } else {
            for (Imovel imovel : imoveis) {
                System.out.println("ID: " + imovel.getId() + ", Matrícula: " + imovel.getMatricula()
                        + ", Endereço: " + imovel.getEndereco() + ", Última Leitura: " + imovel.getUltimaLeitura()
                        + ", Penúltima Leitura: " + imovel.getPenultimaLeitura());
            }
        }
    }


    private static void buscarImovelPorId() {
        System.out.println("==== Buscar Imóvel por ID ====");
        System.out.print("Digite o ID do imóvel: ");
        int id = scanner.nextInt();

        Imovel imovel = imovelDAO.obterImovelPorId(id);

        if (imovel != null) {
            System.out.println("Imóvel encontrado:");
            System.out.println("ID: " + imovel.getId() + ", Matrícula: " + imovel.getMatricula()
                    + ", Endereço: " + imovel.getEndereco() + ", Última Leitura: " + imovel.getUltimaLeitura()
                    + ", Penúltima Leitura: " + imovel.getPenultimaLeitura());
        } else {
            System.out.println("Imóvel não encontrado.");
        }
    }


    private static void atualizarImovel() {
        System.out.println("==== Atualizar Imóvel ====");
        System.out.print("Digite o ID do imóvel que deseja atualizar: ");
        int id = scanner.nextInt();

        Imovel imovel = imovelDAO.obterImovelPorId(id);

        if (imovel != null) {
            System.out.print("Nova Matrícula: ");
            String novaMatricula = scanner.next();
            System.out.print("Novo Endereço: ");
            String novoEndereco = scanner.nextLine();  // Consumir a quebra de linha pendente
            novoEndereco = scanner.nextLine();  // Obter a entrada correta para o endereço
            System.out.print("Nova Última Leitura: ");
            int novaUltimaLeitura = scanner.nextInt();
            System.out.print("Nova Penúltima Leitura: ");
            int novaPenultimaLeitura = scanner.nextInt();

            Imovel imovelAtualizado = new Imovel(id, novaMatricula, novoEndereco, novaUltimaLeitura, novaPenultimaLeitura);
            imovelDAO.atualizarImovel(imovelAtualizado);
            System.out.println("Imóvel atualizado com sucesso!");
        } else {
            System.out.println("Imóvel não encontrado.");
        }
    }


    private static void excluirImovel() {
        System.out.println("==== Excluir Imóvel ====");
        System.out.print("Digite o ID do imóvel que deseja excluir: ");
        int id = scanner.nextInt();

        Imovel imovel = imovelDAO.obterImovelPorId(id);

        if (imovel != null) {
            imovelDAO.excluirImovel(id);
            System.out.println("Imóvel excluído com sucesso!");
        } else {
            System.out.println("Imóvel não encontrado.");
        }
    }

}
