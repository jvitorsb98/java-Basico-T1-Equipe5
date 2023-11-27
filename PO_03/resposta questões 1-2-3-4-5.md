### 1. O que é uma exceção em Java e qual é o propósito de usá-las em programas?

Em Java, uma exceção é um evento que ocorre durante a execução de um programa e interrompe o fluxo normal de instruções. O propósito de usar exceções é lidar com situações imprevistas ou erros durante a execução do programa, permitindo que o código responda a essas situações de maneira controlada e apropriada.

### 2. Pesquise sobre a diferença entre exceções verificadas e não verificadas em Java. Dê exemplos de cada uma.

Em Java, exceções podem ser verificadas (checked) ou não verificadas (unchecked). Exceções verificadas são aquelas que o compilador obriga o programador a tratar ou lançar, enquanto exceções não verificadas são aquelas que o compilador não obriga o tratamento.

Exemplo de exceção verificada:


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploExcecaoVerificada {
    public static void main(String[] args) {
        try {
            // Criação de um objeto File associado ao arquivo "arquivo.txt"
            File file = new File("arquivo.txt");

            // Criação de um objeto Scanner para ler o arquivo
            Scanner scanner = new Scanner(file);

            // O código para processar o arquivo pode ser adicionado aqui

        } catch (FileNotFoundException e) {
            // Tratamento da exceção FileNotFoundException
            e.printStackTrace();
        }
    }
}

Exemplo de exceção não verificada:

java
Copy code
public class ExemploExcecaoNaoVerificada {
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println(array[10]); // Isso lançará ArrayIndexOutOfBoundsException em tempo de execução
    }
}
### 3. Como você pode lidar com exceções em Java? Quais são as palavras-chave e as práticas comuns para tratamento de exceções?

Em Java, as palavras-chave try, catch, finally, e throw são usadas para lidar com exceções. O bloco try contém o código onde uma exceção pode ocorrer, o bloco catch captura e trata a exceção, e o bloco finally é opcional e contém código que será executado independentemente de ocorrer ou não uma exceção.

Exemplo de tratamento de exceção:

java
Copy code
try {
    // código que pode gerar uma exceção
} catch (TipoDeExcecao e) {
    // tratamento da exceção
} finally {
    // código a ser executado independentemente de ocorrer uma exceção ou não
}
Práticas comuns incluem logar a exceção, relançar exceções não verificadas como exceções verificadas quando necessário, e liberar recursos no bloco finally.

### 4. O que é o bloco "try-catch" em Java? Como ele funciona e por que é importante usá-lo ao lidar com exceções?

O bloco try-catch é usado para envolver o código suscetível a exceções (colocado no bloco try) e fornecer um bloco catch para lidar com exceções que podem ocorrer durante a execução do código no bloco try. Isso é importante para evitar que exceções não tratadas interrompam abruptamente o programa e permitir um tratamento adequado dessas exceções.

### 5. Quando é apropriado criar suas próprias exceções personalizadas em Java e como você pode fazer isso? Dê um exemplo de quando e por que você criaria uma exceção personalizada.

É apropriado criar exceções personalizadas quando você deseja representar um erro específico ou uma condição excepcional em seu domínio de aplicação. Isso ajuda a tornar o código mais legível e facilita a identificação e tratamento de problemas específicos.

Exemplo de exceção personalizada:

java
Copy code
public class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
Agora, na sua calculadora de divisão, você pode usar essa exceção personalizada:

java
Copy code
public class Calculadora {
    public int dividirInteiros(int dividendo, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Divisão por zero não é permitida!");
        }
        return dividendo / divisor;
    }

    public float dividirFloats(float dividendo, float divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Divisão por zero não é permitida!");
        }
        return dividendo / divisor;
    }
}
Ao usar a calculadora, você precisa lidar com a exceção personalizada:

java
Copy code
public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        try {
            int resultadoInteiro = calculadora.dividirInteiros(10, 2);
            System.out.println("Resultado da divisão inteira: " + resultadoInteiro);

            float resultadoFloat = calculadora.dividirFloats(5.0f, 0.0f); // Isso lançará DivisionByZeroException
            System.out.println("Resultado da divisão de floats: " + resultadoFloat);
        } catch (DivisionByZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
Neste exemplo, a exceção personalizada DivisionByZeroException é lançada quando ocorre uma tentativa de divisão por zero, e ela é tratada no bloco catch na classe Main.