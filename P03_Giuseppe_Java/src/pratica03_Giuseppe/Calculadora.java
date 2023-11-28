package pratica03_Giuseppe;

public class Calculadora {
    public static int dividirInteiros(int numerador, int divisor) {
        if (divisor == 0) {
            throw new DivisionByZeroException("Divisão por zero não permitida.");
        }
        return numerador / divisor;
    }

    public static float dividirFloat(float numerador, float divisor) {
        if (divisor == 0) {
            throw new DivisionByZeroException("Divisão por zero não permitida.");
        }
        return numerador / divisor;
    }

    public static void main(String[] args) {
        try {
            int resultadoInt = dividirInteiros(10, 0);
            System.out.println("Resultado da divisão de inteiros: " + resultadoInt);
        } catch (DivisionByZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            float resultadoFloat = dividirFloat(5.0f, 0.0f);
            System.out.println("Resultado da divisão de floats: " + resultadoFloat);
        } catch (DivisionByZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
