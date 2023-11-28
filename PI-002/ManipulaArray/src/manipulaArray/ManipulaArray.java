package manipulaArray;

import java.util.Scanner;
import java.util.Random; 

public class ManipulaArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] arrayLido = criarArrayLido(scanner);
        System.out.println("Array lido do usuário:");
        imprimirArray(arrayLido);

        
        int tamanhoArrayAleatorio;
        System.out.print("Digite o tamanho do array aleatório: ");
        tamanhoArrayAleatorio = scanner.nextInt();
        int[] arrayAleatorio = criarArrayAleatorio(tamanhoArrayAleatorio);
        System.out.println("Array aleatório:");
        imprimirArray(arrayAleatorio);

        
        int soma = calcularSoma(arrayLido);
        System.out.println("Soma dos elementos do array lido: " + soma);

        
        int maiorValor = encontrarMaiorValor(arrayLido);
        System.out.println("Maior valor no array lido: " + maiorValor);

        
        int menorValor = encontrarMenorValor(arrayLido);
        System.out.println("Menor valor no array lido: " + menorValor);

        scanner.close();
    }

    
    public static int[] criarArrayLido(Scanner scanner) {
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();
        int[] array = new int[tamanho];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    
    public static int[] criarArrayAleatorio(int tamanho) {
        Random random = new Random();
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(100); 
        }
        return array;
    }

    
    public static int calcularSoma(int[] array) {
        int soma = 0;
        for (int num : array) {
            soma += num;
        }
        return soma;
    }

    
    public static int encontrarMaiorValor(int[] array) {
        int maior = array[0];
        for (int num : array) {
            if (num > maior) {
                maior = num;
            }
        }
        return maior;
    }

    
    public static int encontrarMenorValor(int[] array) {
        int menor = array[0];
        for (int num : array) {
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }

    
    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
