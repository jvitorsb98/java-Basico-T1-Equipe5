import java.util.Scanner;
import java.util.Random;

public class Main {

    // Função para converter dólares para outra moeda
    public static double converterMoeda(double quantidadeDolares, double taxaCambio) {
        return quantidadeDolares * taxaCambio;
    }

    // Função para o Jogo de Adivinhação
    public static void jogoAdivinhacao() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número secreto entre 1 e 100.");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite > numeroSecreto) {
                System.out.println("Muito alto. Tente novamente.");
            } else if (palpite < numeroSecreto) {
                System.out.println("Muito baixo. Tente novamente.");
            }

        } while (palpite != numeroSecreto);

        System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
    }

    // Classe ManipulaArray
    public static class ManipulaArray {

        // Método para criar um array de números lidos do usuário
        public static int[] criarArrayDoUsuario() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o tamanho do array: ");
            int tamanho = scanner.nextInt();

            int[] array = new int[tamanho];

            System.out.println("Digite os elementos do array:");
            for (int i = 0; i < tamanho; i++) {
                System.out.print("Elemento " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }

            return array;
        }

        // Método para criar um array de números aleatórios
        public static int[] criarArrayAleatorio(int tamanho) {
            Random random = new Random();
            int[] array = new int[tamanho];

            for (int i = 0; i < tamanho; i++) {
                array[i] = random.nextInt(100);
            }

            return array;
        }

        // Função para calcular a soma de todos os elementos no array
        public static int calcularSoma(int[] array) {
            int soma = 0;

            for (int elemento : array) {
                soma += elemento;
            }

            return soma;
        }

        // Função para encontrar o maior valor do array
        public static int encontrarMaiorValor(int[] array) {
            int maior = array[0];

            for (int elemento : array) {
                if (elemento > maior) {
                    maior = elemento;
                }
            }

            return maior;
        }

        // Função para encontrar o menor valor do array
        public static int encontrarMenorValor(int[] array) {
            int menor = array[0];

            for (int elemento : array) {
                if (elemento < menor) {
                    menor = elemento;
                }
            }

            return menor;
        }
    }

    // Função main para testar as funcionalidades
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Teste do Conversor de Moedas
        System.out.print("Digite a quantidade em dólares: ");
        double quantidadeDolares = scanner.nextDouble();
        System.out.print("Digite a taxa de câmbio: ");
        double taxaCambio = scanner.nextDouble();
        double valorConvertido = converterMoeda(quantidadeDolares, taxaCambio);
        System.out.println("Valor convertido: " + valorConvertido);

        // Teste do Jogo de Adivinhação
        jogoAdivinhacao();

        // Teste da classe ManipulaArray
        int[] arrayUsuario = ManipulaArray.criarArrayDoUsuario();
        int[] arrayAleatorio = ManipulaArray.criarArrayAleatorio(5);

        System.out.println("Soma do array do usuário: " + ManipulaArray.calcularSoma(arrayUsuario));
        System.out.println("Maior valor do array do usuário: " + ManipulaArray.encontrarMaiorValor(arrayUsuario));
        System.out.println("Menor valor do array do usuário: " + ManipulaArray.encontrarMenorValor(arrayUsuario));

        System.out.println("Soma do array aleatório: " + ManipulaArray.calcularSoma(arrayAleatorio));
        System.out.println("Maior valor do array aleatório: " + ManipulaArray.encontrarMaiorValor(arrayAleatorio));
        System.out.println("Menor valor do array aleatório: " + ManipulaArray.encontrarMenorValor(arrayAleatorio));
    }
}
