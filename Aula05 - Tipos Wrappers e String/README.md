### Tipos Wrappers
as classes Wrappers no Java servem como uma camada intermediária que permite o uso de tipos primitivos como objetos, fornecendo métodos auxiliares para facilitar o trabalho com esses tipos e garantir a compatibilidade com outras estruturas que exigem objetos em vez de primitivos. Isso torna o código mais flexível e eficiente ao manipular diferentes tipos de dados dentro do ambiente Java.

#### Limitações dos tipos primitivos
Coleções e genéricos (conteúdos que veremos nos próximos módulos) no Java não aceitam tipos primitivos porque foram projetados para trabalhar apenas com objetos, não com tipos primitivos. O Java é uma linguagem de programação orientada a objetos, e as coleções e genéricos foram concebidos para armazenar e manipular objetos, não valores primitivos.

Quando você utiliza coleções ou genéricos, está trabalhando com classes que requerem objetos, e os tipos primitivos não são considerados objetos no Java. Para contornar essa limitação, o Java introduziu as classes Wrapper (como mencionadas anteriormente), que são usadas para encapsular os tipos primitivos em objetos.

#### Algumas vantagens em relação ao tipos primitivos
* Integração com coleções e genéricos: Como mencionado anteriormente, coleções e genéricos no Java só aceitam objetos, não tipos primitivos. Utilizando os tipos Wrapper, você pode armazenar e manipular valores primitivos em coleções, como Listas e Mapas, tornando o código mais flexível e eficiente.

* Funcionalidades adicionais: As classes Wrapper oferecem funcionalidades extras que os tipos primitivos não possuem. Por exemplo, elas possuem métodos úteis para conversão de valores em strings, comparações, operações matemáticas, entre outros. Isso torna o código mais legível e evita a necessidade de escrever funções auxiliares para lidar com tarefas comuns envolvendo os tipos primitivos.

* Uso em APIs e bibliotecas: Muitas APIs e bibliotecas do Java são projetadas para trabalhar com objetos e, portanto, requerem o uso dos tipos Wrapper quando se trata de tipos primitivos. Ao utilizar os Wrappers, você pode integrar facilmente o código com essas APIs e tirar proveito de suas funcionalidades.

* Valor nulo (null): Os tipos Wrapper podem conter o valor nulo (null), enquanto os tipos primitivos não têm essa capacidade. Isso é útil em situações em que você precisa representar a ausência de um valor, como em bancos de dados ou em algoritmos que podem retornar um valor opcional.

#### Comparações
Antes de tudo, precisamos entender que Wrappers são referências de objetos. E quando comparamos objetos da forma tradicional (==), é comparado suas referências de memória, não seus valores.


```java
public class ExemploWrapper{
    public static void main(String[] args){
       Integer num1 = 200;
       Integer num2 = 200;

       System.out.println(num1 == num2); // Saída: false

    }
}
```

Para comparações de igualdade de valores, você deve usar o método equals() da classe Wrapper, que compara os valores dos objetos:

```java
    System.out.println(num1.equals(num2)); // Saída: true
```

#### String
é usada para representar sequências de caracteres. Ela é uma classe especial e bastante fundamental na linguagem, e seu funcionamento é otimizado para facilitar a manipulação e o uso de cadeias de caracteres. A classe String é imutável, o que significa que, uma vez criada, seu conteúdo não pode ser alterado.

##### Características
1. Imutabilidade: Como mencionado anteriormente, objetos String são imutáveis, o que significa que, uma vez criados, seus valores não podem ser alterados. Isso tem várias implicações, como garantir que uma String permaneça consistente em todo o código, e torna o uso de String mais seguro em operações de concorrência.

2. Pool de Strings: O Java mantém um pool especial para armazenar objetos String. O pool de Strings garante que duas String com o mesmo conteúdo sejam representadas pelo mesmo objeto em memória. Isso economiza espaço e torna as comparações de igualdade (usando equals()) mais eficientes, pois elas podem ser realizadas comparando as referências de memória dos objetos, em vez de comparar cada caractere individualmente.

3. Concatenação de Strings: A concatenação de String em Java é comum e fácil de ser realizada usando o operador +. No entanto, devido à imutabilidade, a concatenação de String cria novos objetos em vez de modificar os objetos existentes. Para lidar com a concatenação eficiente de muitas Strings, é recomendado o uso da classe StringBuilder, que é mutável e projetada para manipulação eficiente de concatenação de sequências.

4. Métodos Úteis: A classe String fornece muitos métodos úteis para a manipulação de cadeias de caracteres, como length(), charAt(), substring(), indexOf(), startsWith(), endsWith(), entre outros. Esses métodos permitem realizar várias operações comuns em strings, como obter o tamanho da string, extrair substrings, encontrar caracteres ou padrões específicos, verificar prefixos ou sufixos, e muito mais.

5. Comparação de Strings: Para comparar o conteúdo de duas Strings, é importante usar o método equals() em vez do operador ==. O operador == verifica a igualdade das referências de memória, enquanto o método equals() verifica a igualdade do conteúdo dos objetos.

```java
public class ExemploWrapper{
    public static void main(String[] args){
       String frase = "Olá, mundo!";

       System.out.println(frase);    
    }
}
```

# EXERCICIO
* Crie um programa que solicite ao usuário que digite um número inteiro.
* Armazene esse número em uma variável do tipo int.
* Converta esse valor para o respectivo Wrapper Integer.
* Crie outro objeto Integer com o mesmo valor digitado pelo usuário.
* Compare os dois objetos usando o operador de igualdade (==) e imprima o resultado.
* Compare novamente os dois objetos, mas agora usando o método equals() e imprima o resultado.