**Questão 1**

# Em Java e C++, uma classe é um modelo ou um plano para criar objetos. Ela define os atributos (variáveis) e métodos (funções) que um objeto pode ter. Já um objeto é uma instância específica de uma classe, ou seja, é uma variável que pertence a uma classe e pode usar todos os seus atributos e métodos.#

## JAVA ##
```java

public class Pessoa {
    // Atributos
    String nome;
    int idade;
    
    // Método construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    // Método para exibir informações
    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}

```
## C++ ##
```cpp
#include <iostream>
#include <string>
using namespace std;

class Pessoa {
private:
    string nome;
    int idade;

public:
    // Método construtor
    Pessoa(string nome, int idade) : nome(nome), idade(idade) {}

    // Método para exibir informações
    void exibirInfo() {
        cout << "Nome: " << nome << ", Idade: " << idade << endl;
    }
};

```

**Questão 2**
# Em Java, uma linguagem predominantemente orientada a objetos, cada variável tem um modificador de acesso associado. A declaração de variável segue o seguinte padrão: . Se o modificador não for especificado, o padrão é private. No entanto, em C++, os modificadores de acesso são essenciais apenas para os atributos das classes. #

## Java ##
```java
1. char
2. int
3. float
4. double
5. boolean
```
## C++ ##
```cpp
1. char
2. int
3. float
4. double
```

**Questão 3**

## A herança é um conceito essencial na programação orientada a objetos, possibilitando a criação de uma classe adicional (subclasse) a partir de uma classe já existente (classe base ou superclasse). A subclasse adquire as características (métodos e atributos) da superclasse, viabilizando a reutilização de código e a ampliação de funcionalidades. ## 

## JAVA ##

```java
// Classe base em Java
class Veiculo {
    String marca;
    int ano;

    void acelerar() {
        System.out.println("Acelerando...");
    }
}

// Subclasse que herda de Veiculo
class Carro extends Veiculo {
    int numPortas;

    void abrirPorta() {
        System.out.println("Porta aberta!");
    }
}

```
## C++ ##
```cpp
#include <iostream>
#include <string>

// Classe base
class Animal {
public:
    Animal(std::string species) : species(species) {}

    void fazerSom() {
        std::cout << "Som de um animal\n";
    }

protected:
    std::string species;
};

// Subclasse pública
class Cachorro : public Animal {
public:
    Cachorro() : Animal("Cachorro") {}

    void abanarRabo() {
        std::cout << "Rabo abanando!\n";
    }
};

// Subclasse protegida
class Retangulo : protected Animal {
public:
    Retangulo() : Animal("Retangulo") {}

    double calcularArea() {
        area = 10.5; // Acesso protegido
        return area;
    }
};

// Subclasse privada
class Estudante : private Animal {
public:
    Estudante() : Animal("Estudante") {}

    void mostrarInfo() {
        std::cout << "Sou um estudante.\n";
    }
};

// Herança virtual
class Forma {
    // implementação
};

class Forma3D : virtual public Forma {
    // implementação
};

// Herança múltipla
class A {
    // implementação
};

class B {
    // implementação
};

class C : public A, public B {
    // implementação
};

int main() {
    // Exemplo de herança pública
    Cachorro dog;
    dog.fazerSom();
    dog.abanarRabo();

    // Exemplo de herança protegida
    Retangulo rectangle;
    std::cout << "Área do retângulo: " << rectangle.calcularArea() << std::endl;

    // Exemplo de herança privada
    Estudante student;
    student.mostrarInfo();

    return 0;
}

```

**Questão 4**

## Em Java, todas as variáveis de objetos são referências, mas não são explicitamente indicadores. Ao declarar uma variável de objeto em Java, você está estabelecendo uma referência a um objeto no heap. Entretanto, o programador não tem acesso direto ao endereço de memória (como ocorre com indicadores em C++). O gerenciamento de memória é realizado automaticamente pelo coletor de lixo (garbage collector) em Java. ##
## JAVA ##
```java
    String texto = "Exemplo";
```
## C++ ##
     Em C++, você possui maior domínio sobre o manuseio de indicadores e alocação/liberação de memória. A definição de variáveis de objetos pode ser feita tanto diretamente quanto por meio de indicadores, conforme a necessidade do programador. C++ possibilita operações com indicadores e demanda que o programador gerencie a memória manualmente (por exemplo, utilizando new e delete).

