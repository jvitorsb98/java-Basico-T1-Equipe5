package calculadoraDivisao;

public class Calculadora {
	
    public int adicao(int a, int b) {
        return a + b;
    }

    
    public int subtracao(int a, int b) {
        return a - b;
    }

    
    public int multiplicacao(int a, int b) {
        return a * b;
    }

    
    public int divisaoInteira(int dividendo, int divisor) throws ExcecaoDivisaoPorZero {
        if (divisor == 0) {
            throw new ExcecaoDivisaoPorZero("Divisão por zero não é permitida!");
        }
        return dividendo / divisor;
    }

    
    public float divisaoFloat(float dividendo, float divisor) throws ExcecaoDivisaoPorZero {
        if (divisor == 0.0f) {
            throw new ExcecaoDivisaoPorZero("Divisão por zero não é permitida!");
        }
        return dividendo / divisor;
    }

}
