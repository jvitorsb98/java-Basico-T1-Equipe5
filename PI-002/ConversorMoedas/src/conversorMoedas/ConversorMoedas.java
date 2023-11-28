package conversorMoedas;

import java.util.Scanner;

public class ConversorMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Conversor de Moedas!");
        System.out.print("Insira a quantidade em dólares: ");
        double quantidadeDolares = 0;

        
        if (scanner.hasNextDouble()) {
            quantidadeDolares = scanner.nextDouble();
        } else {
            System.out.println("Por favor, insira um valor numérico válido.");
            scanner.close();
            return; 
        }

        System.out.print("Insira a taxa de câmbio: ");
        double taxaCambio = 0;

        
        if (scanner.hasNextDouble()) {
            taxaCambio = scanner.nextDouble();
        } else {
            System.out.println("Por favor, insira um valor numérico válido.");
            scanner.close();
            return; 
        }

        double valorConvertido = quantidadeDolares * taxaCambio;

        System.out.println(quantidadeDolares + " dólares equivalem a " + valorConvertido + " na moeda estrangeira.");

        scanner.close();
    }
}
