package manipulaArray;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class ManipulaArray {
   
    public static int[] criarArrayDoUsuario() {
        
    	Scanner sc = new Scanner(System.in);
       
    	System.out.print("Digite o tamanho do array: ");
       
    	int tamanho = sc.nextInt();
       
    	int[] array = new int[tamanho];

        System.out.println("Digite os elementos do array:");
       
        for (int i = 0; i < tamanho; i++) {
           
        	System.out.print("Elemento " + (i + 1) + ": ");
           
        	array[i] = sc.nextInt();
        }

        return array;
    }

    
    public static int[] criarArrayAleatorio(int tamanho, int limiteSuperior) {
        Random random = new Random();
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
        	
        	
                 array[i] = random.nextInt(limiteSuperior + 1);
        }

        return array;
    }

 
    public static int calcularSoma(int[] array) {
    	
        int soma = 0;
        
        for (int elemento : array) {
        	
            soma += elemento;
        }
        return soma;
    }

  
    public static int encontrarMaiorValor(int[] array) {
    	
        int maior = array[0];
        
        for (int elemento : array) {
        	
            if (elemento > maior) {
            	
                maior = elemento;
            }
        }
        return maior;
    }

    
    public static int encontrarMenorValor(int[] array) {
    	
        int menor = array[0];
        
        for (int elemento : array) {
        	
            if (elemento < menor) {
            	
                menor = elemento;
            }
        }
        return menor;
    }

    public static void main(String[] args) {
    	
        int[] arrayUsuario = criarArrayDoUsuario();
        
        int[] arrayAleatorio = criarArrayAleatorio(5, 50);

        System.out.println("Array do usuário: " + Arrays.toString(arrayUsuario));
        System.out.println("Array aleatório: " + Arrays.toString(arrayAleatorio));

        System.out.println("Soma do array do usuário: " + calcularSoma(arrayUsuario));
        System.out.println("Soma do array aleatório: " + calcularSoma(arrayAleatorio));

        System.out.println("Maior valor do array do usuário: " + encontrarMaiorValor(arrayUsuario));
        System.out.println("Menor valor do array aleatório: " + encontrarMenorValor(arrayAleatorio));
    }
}
