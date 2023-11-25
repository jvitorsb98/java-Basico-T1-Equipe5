package conversorDeMoedas;

import java.util.Scanner;

public class ConversorDeMoedas {
    
	public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite a taxa de câmbio: ");
        
        double taxaCambio = sc.nextDouble();

      
        System.out.print("Digite a quantidade em dólares: ");
       
        double quantidadeDolares = sc.nextDouble();

   
        double valorConvertido = quantidadeDolares * taxaCambio;

      
        System.out.println("O valor convertido em reias brasileiro é: " + valorConvertido);

    }
}
