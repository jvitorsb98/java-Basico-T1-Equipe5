package jogodeAdivinhacao;

import java.util.Random;
import java.util.Scanner;

public class JogodeAdivinhacao {
    public static void main(String[] args) {
    	
    	
        Scanner sc = new Scanner(System.in);
        
        
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        
        
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        int tentativas = 0;
        
        int palpite;

        do {
            System.out.print("Digite seu palpite: ");
            
            
            palpite = sc.nextInt();
            
            tentativas++;

            if (palpite == numeroSecreto) {
            	
            	
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
                
                
            } else if (palpite < numeroSecreto) {
            	
            	
                System.out.println("Muito baixo. Tente novamente.");
                
                
            } else {
            	
            	
                System.out.println("Muito alto. Tente novamente.");
                
                
            }
            
            
        } while (palpite != numeroSecreto);

    }
}
