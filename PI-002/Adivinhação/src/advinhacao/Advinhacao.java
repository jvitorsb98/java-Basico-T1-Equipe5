package advinhacao;

import java.util.Random;
import java.util.Scanner;

public class Advinhacao {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite;

        System.out.println("Bem-vindo ao Jogo de Adivinhação! Tente adivinhar o número entre 1 e 100.");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite > numeroAleatorio) {
                System.out.println("Muito alto! Tente um número menor.");
            } else if (palpite < numeroAleatorio) {
                System.out.println("Muito baixo! Tente um número maior.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            }
        } while (palpite != numeroAleatorio);

        scanner.close();
    }

}
