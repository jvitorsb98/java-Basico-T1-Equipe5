#1 - O que é uma classe em Java e qual é a diferença entre uma classe e um objeto? Dê 5 exemplos mostrando-os em C++ e em Java.
Resposta:
Em Java, uma classe é um modelo ou plano, semelhante a uma maquete de casa, enquanto um objeto é a instância concreta dessa classe, ou seja, uma casa construída com base no plano. Aqui estão exemplos simples em C++ e Java para ilustrar isso:

##Exemplo 1: Pessoa

##Java
public class Pessoa {
    private String nome;
    private String cpf;

    Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCPF(){
        return this.cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }
}

##C++
#include <iostream>
using namespace std;

class Pessoa {
private:
    string nome;
    string cpf;

public:
    string getNome() {
        return nome;
    }

    string getCPF() {
        return cpf;
    }

    void setNome(string _nome){
        nome = _nome;
    }

    void setCPF(string _cpf){
        cpf = _cpf;
    }
};

int main() {
    Pessoa pessoa("Fulano", "123456789");
    return 0;
}


##Exemplo 2: Círculo

##Java
public class Circulo {
    double raio;

    double calcularArea() {
        return 3.1415 * raio * raio;
    }

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        circulo1.raio = 2.5;
        System.out.println("Área do círculo: " + circulo1.calcularArea());
    }
}

##C++
#include <iostream>
using namespace std;

class Circulo {
public:
    double raio;

    double calcularArea() {
        return 3.1415 * raio * raio;
    }
};

int main() {
    Circulo circulo1;
    circulo1.raio = 2.5;
    cout << "Área do círculo: " << circulo1.calcularArea() << endl;
    return 0;
}

##Exemplo 3: Livro

##Java
public class Livro {
    String titulo;
    String autor;

    void exibirInfo() {
        System.out.println("Livro: " + titulo + " | Autor: " + autor);
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Apanhador no Campo de Centeio";
        livro1.autor = "J.D. Salinger";
        livro1.exibirInfo();
    }
}

##C++
#include <iostream>
using namespace std;

class Livro {
public:
    string titulo;
    string autor;

    void exibirInfo() {
        cout << "Livro: " << titulo << " | Autor: " << autor << endl;
    }
};

int main() {
    Livro livro1;
    livro1.titulo = "Apanhador no Campo de Centeio";
    livro1.autor = "J.D. Salinger";
    livro1.exibirInfo();
    return 0;
}

##Exemplo 4: Conta Bancária
##Java
public class ContaBancaria {
    String titular;
    double saldo;

    void exibirSaldo() {
        System.out.println("Saldo de " + titular + ": $" + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "João";
        conta1.saldo = 1000.0;
        conta1.exibirSaldo();
    }
}


##C++
#include <iostream>
using namespace std;

class ContaBancaria {
public:
    string titular;
    double saldo;

    void exibirSaldo() {
        cout << "Saldo de " << titular << ": $" << saldo << endl;
    }
};

int main() {
    ContaBancaria conta1;
    conta1.titular = "João";
    conta1.saldo = 1000.0;
    conta1.exibirSaldo();
    return 0;
}

##Exemplo 5: Retângulo
##Java
public class Retangulo {
    double largura;
    double altura;

    double calcularArea() {
        return largura * altura;
    }

    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo();
        retangulo1.largura = 5.0;
        retangulo1.altura = 3.0;
        System.out.println("Área do retângulo: " + retangulo1.calcularArea());
    }
}


##C++
#include <iostream>
using namespace std;

class Retangulo {
public:
    double largura;
    double altura;

    double calcularArea() {
        return largura * altura;
    }
};

int main() {
    Retangulo retangulo1;
    retangulo1.largura = 5.0;
    retangulo1.altura = 3.0;
    cout << "Área do retângulo: " << retangulo1.calcularArea() << endl;
    return 0;
}


#2-Como você declara uma variável em Java e quais são os tipos de dados primitivos mais comuns? Faça um paralelo entre isso e a mesma coisa na linguagem C++.

##Resposta: 

##Java
public class Main {

    public static void main(String[] args) {
        // Declaração básica de variável em Java
        int number;

        // Tipos primitivos mais comuns:
        byte myByte = -20;
        short myShort = 32;
        int myInt = 42;
        long myLong = 123456789012345L;

        float myFloat = 3.14f; // Adicionando sufixo 'f' para indicar que é um float
        double myDouble = 3.141592653589793;

        char myChar = 'R';

        boolean myBoolean = true;
    }
}

##C++
#include <iostream>
using namespace std;

int main() {
    int myInt = 10;
    short myShort = 1;
    long myLong = 123456789012345;
    long long myLonglong = 123456789012345123456789012345;

    float myFloat = 3.14f; // Adicionando sufixo 'f' para indicar que é um float
    double myDouble = 3.141592653589793;

    char myChar = 'R';

    bool myBool = true;

    return 0;
}


#3-Explique o conceito de herança em Java e como você pode criar uma
subclasse a partir de uma classe existente. Faça um paralelo com C++,
apresentando 5 exemplos. 

Herança em Java:
Em Java, a herança é um conceito que permite criar uma nova classe (subclasse) baseada em uma classe existente (superclasse). A subclasse herda os atributos e métodos da superclasse, promovendo a reutilização de código e facilitando a criação de hierarquias de classes. Para criar uma subclasse em Java, utiliza-se a palavra-chave extends.

Exemplo em Java:

java
Copy code
public class Animal {
    public void emitirSom() {
        System.out.println("Som genérico de animal");
    }
}

public class Cachorro extends Animal {
    public void latir() {
        System.out.println("Latindo...");
    }
}
Herança em C++:
Em C++, a herança é implementada de maneira semelhante a Java. Para criar uma subclasse em C++, utiliza-se a palavra-chave : public após o nome da classe base.

Exemplo em C++:

cpp
Copy code
class Animal {
public:
    void fazerSom() {
        cout << "Som genérico de animal" << endl;
    }
};

class Cachorro : public Animal {
public:
    void latir() {
        cout << "Latindo..." << endl;
    }
};
Paralelo com C++ - 5 Exemplos:

Veículo:
java
Copy code
// Java
public class Veiculo {
    protected String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }
}

// C++
class Veiculo {
protected:
    string modelo;

public:
    Veiculo(string modelo) : modelo(modelo) {}
};
Bicicleta:
java
Copy code
// Java
public class Bicicleta extends Veiculo {
    private int numMarchas;

    public Bicicleta(String modelo, int numMarchas) {
        super(modelo);
        this.numMarchas = numMarchas;
    }
}

// C++
class Bicicleta : public Veiculo {
private:
    int numMarchas;

public:
    Bicicleta(string modelo, int numMarchas) : Veiculo(modelo), numMarchas(numMarchas) {}
};
Estudante:
java
Copy code
// Java
public class Estudante {
    protected String nome;

    public Estudante(String nome) {
        this.nome = nome;
    }
}

// C++
class Estudante {
protected:
    string nome;

public:
    Estudante(string nome) : nome(nome) {}
};
Aluno:
java
Copy code
// Java
public class Aluno extends Estudante {
    private int matricula;

    public Aluno(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }
}

// C++
class Aluno : public Estudante {
private:
    int matricula;

public:
    Aluno(string nome, int matricula) : Estudante(nome), matricula(matricula) {}
};
Celular:
java
Copy code
// Java
public class Celular {
    protected String marca;

    public Celular(String marca) {
        this.marca = marca;
    }
}

// C++
class Celular {
protected:
    string marca;

public:
    Celular(string marca) : marca(marca) {}
};

#4-Quando declaramos uma variável em Java, temos, na verdade, um ponteiro.
Em C++ é diferente. Discorra sobre esse aspecto. 


A afirmação de que "quando declaramos uma variável em Java, temos, na verdade, um ponteiro" não é precisa e pode gerar confusão. Em Java, a gestão de memória é feita automaticamente pelo Garbage Collector, e a linguagem não expõe ponteiros de forma direta como em C++. Vamos entender as diferenças:

Java:
Em Java, as variáveis de objetos são referências a objetos. Quando você declara uma variável de um tipo de objeto (por exemplo, MinhaClasse objeto;), você está criando uma referência a esse objeto. No entanto, a alocação e desalocação de memória são tratadas automaticamente pelo Garbage Collector, e você não lida diretamente com ponteiros.

Exemplo em Java:

java
Copy code
MinhaClasse objeto = new MinhaClasse();
Neste caso, objeto é uma referência para um objeto da classe MinhaClasse. Não há necessidade de preocupação com a alocação ou liberação de memória manualmente.

C++:
Em C++, ao declarar uma variável de um tipo de objeto, você está alocando diretamente a memória para esse objeto. As variáveis podem ser ponteiros ou objetos reais, dependendo de como são declaradas. A gestão de memória é manual, o que significa que você é responsável por alocar e desalocar memória.

Exemplo em C++:

cpp
Copy code
MinhaClasse* objeto = new MinhaClasse(); // Alocação dinâmica com ponteiro
Neste caso, objeto é um ponteiro para um objeto da classe MinhaClasse. A memória precisa ser liberada manualmente usando delete quando não for mais necessária.