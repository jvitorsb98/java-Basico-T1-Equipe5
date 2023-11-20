/*Calculadora Simples:
Crie um programa que funcione como uma calculadora simples. O programa deve
pedir ao usuário que insira dois números e depois escolha uma operação (adição,
subtração, multiplicação ou divisão). Em seguida, o programa deve calcular o
resultado e exibi-lo.*/


package calculadoraSimples;

import java.util.Scanner;

public class Calculadora {
	
	public static double sum(double number1, double number2) {
		return number1 + number2;
	}
	
	public static double subtract(double number1, double number2) {
		return number1 - number2;
	}
	
	public static double multiply(double number1, double number2) {
		return number1 * number2;
	}
	
	public static double divide(double number1, double number2) {
		if(number2 != 0) {
			return number1 / number2;			
		} else {
			 throw new ArithmeticException("Não é possível dividir por zero.");
		}
	}
	
	public static void result(double number1, double number2) {
		double result = 0;
		char option;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Opção 1: +");
			System.out.println("Opção 2: -");
			System.out.println("Opção 3: *");
			System.out.println("Opção 4: /");
			System.out.println("Opção 5: 0");
			
			System.out.println("Escolha uma das opções abaixo, digite 0 para sair: ");
			option = scanner.next().charAt(0);
		
			
			switch(option) {
				case '+':
					 result = sum(number1, number2);
					 System.out.println("A soma entre " + number1 + " e " + number2 + " é: " + result);
				break;
				
				case '-':
					result = subtract(number1, number2);
					System.out.println("A subtracao entre " + number1 + " e " + number2 + " é: " + result);
				break;
				
				case '*':
					result = multiply(number1, number2);
					System.out.println("A multiplicação entre " + number1 + " e " + number2 + " é: " + result);
				break;
				
				case '/':
					result = divide(number1, number2);
					System.out.println("A divisão entre " + number1 + " e " + number2 + " é: " + result);
				break;
				
				case '0':
	
				break;
				default:
					System.out.println("Opção inválida");
				break;
			}
		}while(option != '0');
		scanner.close();
	}




	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		double number1 = scanner.nextDouble();
		
		System.out.println("Digite o segundo número:");
		double number2 = scanner.nextDouble();
		
		Calculadora.result(number1, number2);	
		scanner.close();
	}

}