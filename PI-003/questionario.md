## O que é uma exceção em Java e qual é o propósito de usá-las em programas? ##

Uma exceção em Java é um evento anormal que ocorre durante a execução de um programa e interrompe o fluxo normal de operações. O propósito das exceções é lidar com situações inesperadas ou indesejadas que podem ocorrer durante a execução do programa, como erros de entrada de dados, operações matemáticas inválidas ou problemas de acesso a recursos. Ao utilizar exceções, os desenvolvedores podem detectar e tratar esses problemas de forma estruturada e controlada, mantendo a integridade do programa e permitindo uma resposta adequada a esses eventos inesperados.

## Pesquise sobre a diferença entre exceções verificadas e não verificadas em Java. Dê exemplos de cada uma. ##
As exceções verificadas são aquelas que são subtipos de Exception, exceto RuntimeException e suas subclasses. O compilador obriga o programador a lidar com essas exceções usando try-catch ou declarando-as na assinatura do método com throws. Exemplos incluem IOException, SQLException, entre outros.
Já as exceções não verificadas são subtipos de RuntimeException. Elas não precisam ser declaradas ou tratadas pelo programador. Exemplos comuns são NullPointerException, ArrayIndexOutOfBoundsException e ArithmeticException.

## Como você pode lidar com exceções em Java? Quais são as palavras-chave e as práticas comuns para tratamento de exceções? ##

Em Java, para lidar com exceções, as palavras-chave fundamentais são try, catch, finally, throw e throws:

try: Define um bloco de código onde uma exceção pode ocorrer.
catch: Captura e trata exceções específicas que podem ocorrer dentro do bloco try.
finally: Define um bloco de código que é executado, independentemente de ocorrer ou não uma exceção.
throw: Explicitamente lança uma exceção em um ponto específico do código.
throws: Declara exceções que um método pode lançar, sem tratá-las ali mesmo.
Práticas comuns incluem capturar exceções específicas, lidar com exceções de forma apropriada para a situação, liberar recursos no bloco finally e lançar exceções apropriadas para indicar condições excepcionais.

## O que é o bloco "try-catch" em Java? Como ele funciona e por que é importante usá-lo ao lidar com exceções? ##

O bloco try-catch é utilizado para lidar com exceções em Java. O código suscetível a exceções é colocado dentro do bloco try, e caso uma exceção ocorra, é capturada por um ou mais blocos catch que correspondam ao tipo da exceção. Isso previne a interrupção abrupta do programa, permitindo ao desenvolvedor lidar com erros de maneira controlada e continuar a execução do programa. É importante usá-lo ao lidar com exceções para manter a estabilidade e a integridade do programa, garantindo que ele possa se recuperar de eventos inesperados.

## Quando é apropriado criar suas próprias exceções personalizadas em Java e como você pode fazer isso? Dê um exemplo de quando e por que você criaria uma exceção personalizada. ##

É apropriado criar exceções personalizadas quando você tem uma situação específica no seu programa que não é bem representada pelas exceções padrão do Java. Por exemplo, ao desenvolver um software de processamento de pedidos, você pode criar uma exceção PedidoInvalidoException para lidar com pedidos inválidos. Isso fornece um meio de identificar e tratar problemas específicos do seu domínio de aplicação, permitindo uma manipulação mais precisa e clara das situações excepcionais. Para criar uma exceção personalizada em Java, você pode estender a classe Exception ou suas subclasses, implementando construtores e métodos específicos para a sua exceção personalizada.