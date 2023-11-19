package calculadora;
import java.util.Scanner;

public class CalculadoraSimples {

    public double addition(double number1, double number2) {
        return number1 + number2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        // Multiply the two numbers
        double result = num1 * num2;

        // Return the result
        return result;
    }

    public double divide(double num1, double num2) {
        return num1 / num2;
    }

    public void runCalculator() {
        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);

        do {
            double numero1, numero2, resultado;

            System.out.print("Digite o primeiro número: ");
            numero1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            numero2 = scanner.nextDouble();

            int escolha = getUserInput(scanner);

            resultado = performCalculation(escolha, numero1, numero2);

            System.out.println("O resultado é: " + resultado);

            System.out.println("Continuar? (s/n)");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        } while (continuar);
    }

    public int getUserInput(Scanner scanner) {
        StringBuilder menu = new StringBuilder();
        menu.append("Escolha a operação:\n");
        menu.append("1 - Adição\n");
        menu.append("2 - Subtração\n");
        menu.append("3 - Multiplicação\n");
        menu.append("4 - Divisão\n");
        System.out.println(menu.toString());
        return scanner.nextInt();
    }

    public double performCalculation(int escolha, double numero1, double numero2) {
        double resultado = 0;
        CalculadoraSimples calculadora = new CalculadoraSimples();
        switch (escolha) {
            case 1:
                resultado = calculadora.addition(numero1, numero2);
                break;
            case 2:
                resultado = calculadora.subtract(numero1, numero2);
                break;
            case 3:
                resultado = calculadora.multiply(numero1, numero2);
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = calculadora.divide(numero1, numero2);
                } else {
                    System.out.println("Não é possível dividir por zero.");
                    return resultado;
                }
                break;
            default:
                System.out.println("Escolha inválida.");
                return resultado;
        }
        return resultado;
    }

    public static void main(String[] args) {
        CalculadoraSimples calculadora = new CalculadoraSimples();
        calculadora.runCalculator();

    }
}
