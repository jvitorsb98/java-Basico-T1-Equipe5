package VIEW;



import java.util.ArrayList;
import java.util.Scanner;

import DAO.Imovel_DAO;
import MODEL.Fatura;
import MODEL.Imovel;

public abstract class MenuGestaoFaturas {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Imovel_DAO imovelDAO = new Imovel_DAO();

    public static void exibirMenu() {
        int opcao;
        do {
            System.out.println("==== Menu Faturas ====");
            System.out.println("1. Criar Fatura");
            System.out.println("2. Listar Todas as Faturas");
            System.out.println("3. Listar Faturas em Aberto");
            System.out.println("0. Voltar ao Menu Anterior");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    criarFatura();
                    break;
                case 2:
                    listarTodasFaturas();
                    break;
                case 3:
                    listarFaturasEmAberto();
                    break;
                case 0:
                    System.out.println("Voltando ao Menu Anterior.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void criarFatura() {
        System.out.println("==== Criar Fatura ====");
        System.out.print("Matrícula do Imóvel: ");
        String matricula = scanner.next();

        Imovel imovel = imovelDAO.obterImovelPorMatricula(matricula);

        if (imovel != null) {
            int ultimaLeitura = imovel.getUltimaLeitura();
            int penultimaLeitura = imovel.getPenultimaLeitura();

            imovel.setPenultimaLeitura(ultimaLeitura);
            System.out.print("Nova Leitura Atual: ");
            int novaLeituraAtual = scanner.nextInt();
            imovel.setUltimaLeitura(novaLeituraAtual);

            double custoPorKWh = 10.0;
            double valorFatura = (novaLeituraAtual - penultimaLeitura) * custoPorKWh;

            // Criar instância de Fatura
            Fatura fatura = new Fatura(ultimaLeitura, novaLeituraAtual,valorFatura,imovel);
            imovel.getFaturas().add(fatura);
            

            System.out.println("Fatura criada com sucesso!");
        } else {
            System.out.println("Imóvel não encontrado.");
        }
    }

    private static void listarTodasFaturas() {
        System.out.println("==== Listar Todas as Faturas ====");
        System.out.print("Matrícula do Imóvel: ");
        String matricula = scanner.next();

        Imovel imovel = imovelDAO.obterImovelPorMatricula(matricula);

        if (imovel != null) {
            ArrayList<Fatura> faturasDoImovel = imovel.getFaturas();
            for (Fatura fatura : faturasDoImovel) {
                exibirDetalhesFatura(fatura);
            }
        } else {
            System.out.println("Imóvel não encontrado.");
        }
    }

    private static void listarFaturasEmAberto() {
        System.out.println("==== Listar Faturas em Aberto ====");
        System.out.print("Matrícula do Imóvel: ");
        String matricula = scanner.next();

        Imovel imovel = imovelDAO.obterImovelPorMatricula(matricula);

        if (imovel != null) {
            ArrayList<Fatura> faturasDoImovel = imovel.getFaturas();
            for (Fatura fatura : faturasDoImovel) {
                if (!fatura.isQuitado()) {
                    exibirDetalhesFatura(fatura);
                }
            }
        } else {
            System.out.println("Imóvel não encontrado.");
        }
    }

    private static void exibirDetalhesFatura(Fatura fatura) {
        System.out.println("Data de Emissão: " + fatura.getData());
        System.out.println("Última Leitura: " + fatura.getUltimaLeitura());
        System.out.println("Penúltima Leitura: " + fatura.getPenultimaLeitura());
        System.out.println("Valor: " + fatura.getValor());
        System.out.println("Quitada: " + (fatura.isQuitado() ? "Sim" : "Não"));
        System.out.println("--------");
    }



}
