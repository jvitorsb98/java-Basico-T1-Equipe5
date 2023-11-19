# java-Basico-T1-Equipe5

## Respostas:
1. O que é uma classe em Java e qual é a diferença entre uma classe e um objeto? Dê 5 exemplos mostrando-os em C++ e em Java.

Classe em Java:
Uma classe em Java é uma estrutura que define o comportamento e as propriedades de objetos. Ela é uma espécie de modelo que descreve como os objetos desse tipo devem ser criados. Uma classe contém atributos (variáveis) e métodos (funções).

Diferença entre classe e objeto:

    Classe: Define um tipo de dado.
    Objeto: Instância de uma classe.

Exemplos em C++ e Java:

java

// Exemplo 1 em Java

    class Carro {
        String modelo;
        int ano;

        void ligar() {
            System.out.println("Carro ligado.");
        }
    }

// Exemplo 2 em Java

    class Pessoa {
        String nome;
        int idade;

        void saudacao() {
            System.out.println("Olá, eu sou " + nome);
        }
    }

// Exemplo 3 em Java
    class Retangulo {
        double altura;
        largura;

        double calcularArea() {
            return altura * largura;
        }
    }

// Exemplo 4 em Java

    class Circulo {
        double raio;

        double calcularArea() {
            return Math.PI * raio * raio;
        }
    }

// Exemplo 5 em Java

    class Livro {
        String titulo;
        String autor;

        void imprimirDetalhes() {
            System.out.println("Livro: " + titulo + " - Autor: " + autor);
        }
    }

2. Como você declara uma variável em Java e quais são os tipos de dados primitivos mais comuns? Faça um paralelo entre isso e a mesma coisa na linguagem C++

Declaração de variáveis em Java:

java

    int idade = 25; // Exemplo de declaração em Java

Tipos de dados primitivos comuns em Java e C++:

    Java:
        int: Números inteiros.
        double: Números decimais.
        boolean: Valor booleano.
        char: Caractere.
        String: Sequência de caracteres.

    C++:
        int: Números inteiros.
        double: Números decimais.
        bool: Valor booleano.
        char: Caractere.
        string: Sequência de caracteres.

3. Explique o conceito de herança em Java e como você pode criar uma subclasse a partir de uma classe existente. Faça um paralelo com C++, apresentando 5 exemplos.

Herança em Java:
A herança permite que uma classe herde características e comportamentos de outra classe. A classe que é herdada é chamada de classe base ou superclasse, e a classe que herda é chamada de classe derivada ou subclasse.

Exemplos em Java e C++:

java

// Exemplo 1 em Java

    class Animal {
        void emitirSom() {
            System.out.println("Som genérico de animal.");
        }
    }

    class Cachorro extends Animal {
        void latir() {
            System.out.println("Au au!");
        }
    }

// Exemplo 2 em Java

    class Veiculo {
        void acelerar() {
            System.out.println("Acelerando...");
        }
    }

    class Carro extends Veiculo {
        void buzinar() {
            System.out.println("Beep beep!");
        }
    }

// Exemplo 3 em Java

    class Forma {
        void desenhar() {
            System.out.println("Desenhando forma...");
        }
    }

    class Circulo extends Forma {
        void calcularArea() {
            System.out.println("Calculando área do círculo...");
        }
    }

// Exemplo 4 em Java

    class Funcionario {
        void trabalhar() {
            System.out.println("Realizando atividades de trabalho.");
        }
    }

    class Desenvolvedor extends Funcionario {
        void codificar() {
            System.out.println("Codificando...");
        }
    }

// Exemplo 5 em Java

    class Instrumento {
        void tocar() {
            System.out.println("Tocando instrumento musical.");
        }
    }

    class Violao extends Instrumento {
        void afinar() {
            System.out.println("Afinando o violão.");
        }
    }

4. Quando declaramos uma variável em Java, temos, na verdade, um ponteiro. Em C++ é diferente. Discorra sobre esse aspecto.

Java:
Em Java, quando declaramos uma variável de um objeto, estamos criando uma referência a esse objeto. A variável em si não contém o objeto, mas sim um endereço de memória onde o objeto está localizado.

java

// Exemplo em Java

    Carro meuCarro = new Carro();

C++:
Em C++, quando declaramos um objeto, estamos alocando diretamente o espaço de memória para esse objeto, e a variável contém o objeto em si, não uma referência.

cpp

// Exemplo em C++

    Car myCar;

Essa diferença tem implicações no gerenciamento de memória e no comportamento das variáveis, especialmente ao lidar com passagem de parâmetros e manipulação de objetos. Java utiliza garbage collection para gerenciar a memória automaticamente, enquanto em C++, é comum lidar com alocação e desalocação de memória manualmente.
