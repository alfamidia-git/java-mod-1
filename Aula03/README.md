## PRIMEIRO CÓDIGO EM JAVA
```java
public class Exemplo1{
    public static void main(String[] args){
        System.out.println("Olá, mundo!");
    }
}
```
## Variáveis
Uma variável é como uma caixa que podemos usar para armazenar informações em um programa. Ela tem um nome e um espaço para guardar um valor. Podemos pensar em uma variável como um recipiente que guarda algo, como uma gaveta em uma mesa. Assim como colocamos objetos diferentes em gavetas diferentes, podemos colocar diferentes valores em diferentes variáveis.

Por exemplo, vamos imaginar que você está organizando uma festa de aniversário. Você pode usar uma variável chamada "quantidadeDeConvidados" para guardar o número de pessoas que vão comparecer. Digamos que você tenha 10 convidados, então você pode atribuir o valor 10 à variável "quantidadeDeConvidados". Agora, sempre que você precisar saber quantos convidados estão confirmados, você pode simplesmente verificar o valor dessa variável. É como olhar dentro da gaveta rotulada como "quantidadeDeConvidados" e encontrar o número 10 lá dentro. As variáveis são úteis porque nos permitem armazenar e acessar informações de forma fácil e organizada em um programa.

#### Tipos primitivos
Em Java, os tipos primitivos são os tipos de dados básicos que representam valores simples e fundamentais. Eles são chamados de "primitivos" porque não são objetos e não possuem métodos ou recursos adicionais associados a eles. Em vez disso, os tipos primitivos são usados ​​para armazenar valores diretos na memória, ocupando um espaço fixo e permitindo operações rápidas. Os oito tipos primitivos em Java são: byte, short, int, long, float, double, boolean e char.

Aqui está uma tabela que apresenta os oito tipos primitivos do Java:
Em Java, os tipos primitivos são os tipos de dados básicos que representam valores simples e fundamentais. Eles são chamados de "primitivos" porque não são objetos e não possuem métodos ou recursos adicionais associados a eles. Em vez disso, os tipos primitivos são usados ​​para armazenar valores diretos na memória, ocupando um espaço fixo e permitindo operações rápidas. Os oito tipos primitivos em Java são: byte, short, int, long, float, double, boolean e char.

Aqui está uma tabela que apresenta os oito tipos primitivos do Java:

| Tipo Primitivo | Descrição | Tamanho |
-----------------|-----------|---------|
| byte | Representa  números inteiros de 8 bits | 1 byte |
| short |Representa números inteiros de 16 bits | 2 bytes|
| int | Representa números inteiros de 32 bits	|4 bytes |
| long | Representa números inteiros de 64 bits | 8 bytes |
| float | Representa números de ponto flutuante de precisão simples |	4 bytes|
| double| Representa números de ponto flutuante de precisão dupla |	8 bytes |
|boolean| Representa valores verdadeiro ou falso|1 bit|
| char	|Representa um caractere Unicode	| 2 bytes|

#### Wrappers
Os wrappers, também conhecidos como classes de envoltório, são classes fornecidas pelo Java que envolvem os tipos primitivos. Eles permitem tratar os tipos primitivos como objetos, fornecendo funcionalidades adicionais e facilitando a manipulação desses tipos na programação orientada a objetos.

Cada tipo primitivo tem seu próprio wrapper correspondente. Por exemplo, o tipo primitivo int tem o wrapper Integer, o tipo primitivo boolean tem o wrapper Boolean e assim por diante. Os wrappers fornecem métodos úteis para conversão de tipos, manipulação de valores, realização de operações matemáticas e muito mais.
Os wrappers também são usados em contextos em que é necessário trabalhar com objetos, como em coleções (Listas, Sets, etc.), em APIs que exigem objetos e em situações em que é necessário armazenar valores primitivos em estruturas de dados mais complexas.

| Tipo Primitivo | = | Wrappers |
-----------------|-----------|---------|
| byte |  | Byte |
| short | | Short|
| int | | Integer |
| long | | Long |
| float |  | Float|
| double|  | Double |
|boolean| | Boolean|
| char	| | Character|

##### Entendendo o código acima
**Exemplo1**: é o nome da nossa classe principal. Veremos o que é classe mais para frente.
**public static void main(String[] args)**: método inicializador do Java. Ele é obrigatório em todas aplicações java.
**System.out.println()**: Responsável por imprimir no console

## DECLARAÇÃO DE VARIÁVEIS
```java
public class Exemplo1{
    public static void main(String[] args){
        int idade = 30;
        double peso = 80.5;
        char sexo = 'M';
        boolean solteiro = false;
    }
}
```

## IMPRESSÃO DE VARIÁVEIS
```java
public class Exemplo1{
    public static void main(String[] args){
        System.out.println(idade);
        System.out.println(peso);
        System.out.println(sexo);
        System.out.println(solteiro);
    }
}
```

## VARIÁVEIS CONSTANTES
Constantes em Java são valores que não podem ser alterados após sua atribuição inicial. Elas são declaradas usando a palavra-chave final. A utilização de constantes é útil quando se deseja garantir que um valor não seja alterado acidentalmente durante a execução do programa, evitando possíveis erros.
```java
public class Exemplo1{
    public static void main(String[] args){
        final double PI = 3.14;
        double raio = 5.0;

        double area = PI * raio * raio;
        System.out.println("A área do círculo é: " + area);
    }
}
```

## Operadores de Atribuição em Java
Os operadores de atribuição são usados para atribuir valores a variáveis em Java. O operador de atribuição mais comum é o símbolo =. No entanto, Java também oferece outros operadores de atribuição combinados, como +=, -=, *=, /=, entre outros, que permitem atualizar o valor de uma variável com base no seu valor atual. Por exemplo:
```java
public class Exemplo1{
    public static void main(String[] args){
        int numero = 10;

        // Usando o operador de atribuição simples
        int valorAtribuido = numero;
        System.out.println("Valor atribuído: " + valorAtribuido);

        // Usando o operador de atribuição combinado '+='
        valorAtribuido += 5; // Equivalente a: valorAtribuido = valorAtribuido + 5;
        System.out.println("Valor após += 5: " + valorAtribuido);

        // Usando o operador de atribuição combinado '*='
        valorAtribuido *= 2; // Equivalente a: valorAtribuido = valorAtribuido * 2;
        System.out.println("Valor após *= 2: " + valorAtribuido);
    }
}
```

# EXERCICIO
1. Declare duas variáveis do tipo double para armazenar as notas do aluno. Nomeie-as como nota1 e nota2.

2. Declare uma constante do tipo double com o nome PESO_NOTA e atribua o valor 0.5 a ela. Essa constante representa o peso de cada nota na média, ou seja, ambas as notas têm o mesmo peso (50% cada) na composição da média final.

3. Atribua valores às variáveis nota1 e nota2, representando as notas do aluno em uma escala de 0 a 10.

4. Calcule a média aritmética das notas utilizando a fórmula: media = (nota1 * PESO_NOTA) + (nota2 * PESO_NOTA).

5. Por fim, exiba as duas notas informadas pelo aluno, bem como a média calculada, utilizando o comando System.out.println()