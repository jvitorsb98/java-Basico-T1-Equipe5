1. **O que é uma exceção em Java e qual é o propósito de usá-las em programas?**

   Em Java, uma exceção é um evento anormal que ocorre durante a execução de um programa e interrompe o fluxo normal de instruções. As exceções são usadas para lidar com erros e situações inesperadas de forma controlada, permitindo que o programa trate esses problemas de maneira apropriada, em vez de simplesmente quebrar ou encerrar abruptamente.

2. **Diferença entre exceções verificadas e não verificadas em Java:**

    - **Exceções Verificadas (Checked Exceptions):** São exceções que o compilador exige que sejam tratadas explicitamente pelo programador, seja por meio de um bloco `try-catch` ou declarando que o método pode lançar essa exceção usando a palavra-chave `throws`. Exemplos incluem `IOException` e `SQLException`.

   ```java
   // Exemplo de exceção verificada
   try {
       FileReader file = new FileReader("arquivo.txt");
   } catch (FileNotFoundException e) {
       System.out.println("Arquivo não encontrado: " + e.getMessage());
   }
   ```

    - **Exceções Não Verificadas (Unchecked Exceptions):** São exceções que o compilador não exige tratamento explícito. Normalmente, são subclasses de `RuntimeException`. Exemplos incluem `NullPointerException` e `ArrayIndexOutOfBoundsException`.

   ```java
   // Exemplo de exceção não verificada
   String str = null;
   System.out.println(str.length());  // Isso lançará NullPointerException
   ```

3. **Como lidar com exceções em Java:**

   Para lidar com exceções em Java, você pode usar os blocos `try`, `catch`, `finally` e `throw`. As palavras-chave principais incluem:

    - `try`: Define um bloco de código onde exceções podem ocorrer.
    - `catch`: Captura e trata exceções.
    - `finally`: Define um bloco de código que sempre é executado, independentemente de ocorrer uma exceção ou não.
    - `throw`: Lança manualmente uma exceção.

4. **O que é o bloco "try-catch" em Java e por que é importante usá-lo ao lidar com exceções?**

   O bloco `try-catch` em Java é usado para envolver um bloco de código onde exceções podem ocorrer e fornecer um bloco `catch` para tratar essas exceções. É importante usar o `try-catch` para garantir que seu programa possa lidar com situações excepcionais de maneira controlada, evitando que o programa seja encerrado abruptamente.

   ```java
   try {
       // Código onde exceções podem ocorrer
   } catch (TipoDeExcecao e) {
       // Tratamento da exceção
   }
   ```

5. **Quando é apropriado criar suas próprias exceções personalizadas em Java e como você pode fazer isso?**

   É apropriado criar exceções personalizadas quando você tem requisitos específicos para seu programa que não podem ser adequadamente representados por exceções já existentes. Para criar uma exceção personalizada, você deve estender a classe `Exception` (ou suas subclasses, como `RuntimeException`) e fornecer construtores adequados.

   Exemplo de uma exceção personalizada `DivisionByZeroException`:

   ```java
   public class DivisionByZeroException extends RuntimeException {
       public DivisionByZeroException(String message) {
           super(message);
       }
   }
   ```

   Em seguida, você pode usar essa exceção em sua calculadora:

   ```java
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
   ```

   Neste exemplo, a `DivisionByZeroException` é lançada se a tentativa de dividir por zero ocorrer, e ela é tratada no bloco `catch` do método `main`.