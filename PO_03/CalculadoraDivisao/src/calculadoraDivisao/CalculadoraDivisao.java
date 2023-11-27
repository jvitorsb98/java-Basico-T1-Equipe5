package calculadoraDivisao;

import java.util.Scanner;

public class CalculadoraDivisao {

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Divisão por zero não permitida.");
        }
        return a / b;
    }

    public static float dividir(float a, float b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Divisão por zero não permitida.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        System.out.print("Escolha a operação (1: Soma, 2: Subtração, 3: Multiplicação, 4: Divisão): ");
        int escolha = sc.nextInt();

        try {
            switch (escolha) {
                case 1:
                    System.out.println("Resultado: " + somar(numero1, numero2));
                    break;
                case 2:
                    System.out.println("Resultado: " + subtrair(numero1, numero2));
                    break;
                case 3:
                    System.out.println("Resultado: " + multiplicar(numero1, numero2));
                    break;
                case 4:
                    System.out.println("Resultado: " + dividir(numero1, numero2));
                    break;
                default:
                    System.out.println("Operação inválida.");
            }
        } catch (DivisionByZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
