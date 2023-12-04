package calculadoraDivisao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        try {
            
            System.out.println("Soma: " + calculadora.adicao(num1, num2));
            System.out.println("Subtração: " + calculadora.subtracao(num1, num2));
            System.out.println("Multiplicação: " + calculadora.multiplicacao(num1, num2));
            System.out.println("Divisão inteira: " + calculadora.divisaoInteira(num1, num2));
            System.out.println("Divisão float: " + calculadora.divisaoFloat(num1, num2));

        } catch (ExcecaoDivisaoPorZero e) {
            
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close(); 
        }
    }
}
