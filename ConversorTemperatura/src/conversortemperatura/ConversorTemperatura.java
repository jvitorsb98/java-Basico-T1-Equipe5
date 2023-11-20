package conversortemperatura;
import java.util.Scanner;

public class ConversorTemperatura {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de Temperatura");
        System.out.println("Escolha a opção de conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        int escolha = scanner.nextInt();

        double temperatura;
        double resultado;

        switch (escolha) {
            case 1:
                System.out.println("Digite a temperatura em Celsius:");
                temperatura = scanner.nextDouble();
                resultado = celsiusParaFahrenheit(temperatura);
                System.out.println("A temperatura em Fahrenheit é: " + resultado + "°F");
                break;
            case 2:
                System.out.println("Digite a temperatura em Fahrenheit:");
                temperatura = scanner.nextDouble();
                resultado = fahrenheitParaCelsius(temperatura);
                System.out.println("A temperatura em Celsius é: " + resultado + "°C");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
	}

}
