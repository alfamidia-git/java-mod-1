### Estruturas condicionais
As estruturas condicionais são fundamentais na programação e permitem que o fluxo do programa seja alterado com base em condições específicas. Em Java, as estruturas condicionais mais comuns são o if-else e o switch-case.

#### if-else
é utilizado para executar um bloco de código se uma determinada condição for verdadeira, caso contrário, outro bloco de código será executado.

###### exemplo 1:
```java
public class ExemploIfElse{
    public static void main(String[] args){
       int idade = 20

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
}
```

###### exemplo 2:
```java
public class ExemploIfElse{
    public static void main(String[] args){
       int numero = 19;

        if (numero % 2 == 0) {
            System.out.println("O número digitado é par.");
        } else {
            System.out.println("O número digitado é ímpar.");
        }
}
```

##### else-if:
é uma extensão da estrutura if-else e permite adicionar condições adicionais para serem verificadas caso a condição inicial do if seja falsa. Isso permite criar múltiplas ramificações condicionais dentro de uma única estrutura de controle, facilitando a implementação de lógicas mais complexas em um programa.

```java
public class ExemploIfElse{
    public static void main(String[] args){
        int idade = 75;

        if (idade < 0) {
            System.out.println("Idade inválida. Digite um valor positivo.");
        } else if (idade < 18) {
            System.out.println("Você é menor de idade.");
        } else if (idade < 65) {
            System.out.println("Você é adulto.");
        } else {
            System.out.println("Você é idoso.");
        }
}
```
#### switch-case
permite criar uma seleção múltipla com base no valor de uma expressão, direcionando o fluxo do programa para um dos casos correspondentes. 

###### exemplo
```java
        int numeroDia = 4;

        String diaSemana;

        switch (numeroDia) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda-feira";
                break;
            case 3:
                diaSemana = "Terça-feira";
                break;
            case 4:
                diaSemana = "Quarta-feira";
                break;
            case 5:
                diaSemana = "Quinta-feira";
                break;
            case 6:
                diaSemana = "Sexta-feira";
                break;
            case 7:
                diaSemana = "Sábado";
                break;
            default:
                diaSemana = "Dia inválido";
                break;
        }

        System.out.println("O dia da semana correspondente é: " + diaSemana);

```

### Estruturas de repetição
As estruturas de repetição são recursos fundamentais na programação que permitem executar um bloco de código repetidamente com base em uma condição ou até que uma condição seja atendida. Em Java, existem três tipos principais de estruturas de repetição: while, do-while e for.

###### while
 é usado quando o número de repetições não é conhecido antecipadamente, mas depende de uma condição que deve ser verdadeira para que o bloco de código seja executado. Antes de cada iteração, a condição é avaliada, e enquanto for verdadeira, o bloco de código dentro do while é executado.

 ```java
    int numero = 5;

    System.out.println("Contagem regressiva iniciada:");

    while (numero >= 1) {
        System.out.println(numero);
        numero--;
    }

    System.out.println("Contagem regressiva concluída.");
 ```

 ###### do-while
é semelhante ao while, mas com uma diferença crucial: o bloco de código é executado pelo menos uma vez, mesmo que a condição seja falsa. Após cada iteração, a condição é avaliada, e se for verdadeira, o bloco de código é executado novamente.
 ```java
    int numero = 5;

    System.out.println("Contagem regressiva iniciada:");

    do {
        System.out.println(numero);
        numero--;
    } while (numero >= 1);

    System.out.println("Contagem regressiva concluída.");
 ```

 ###### for
 é usado quando o número de repetições é conhecido antecipadamente ou quando é necessário iterar sobre uma sequência de valores. A estrutura for inclui três partes: a inicialização de uma variável de controle, a condição de continuação e uma atualização para a variável de controle após cada iteração.
  ```java
    int soma = 0;

    System.out.println("Calculando a soma dos números de 1 a 10:");

    for (int numero = 1; numero <= 10; numero++) {
            soma += numero;
    }

    System.out.println("A soma dos números de 1 a 10 é: " + soma);
 ```

# EXERCICIOS
1. **if-else** Verificação de Número Positivo
Crie um programa em Java que declare uma variável inteira chamada numero e atribua a ela um valor qualquer. Em seguida, utilize uma estrutura de controle if-else para verificar se o número é positivo ou negativo. Caso o número seja positivo, imprima "O número é positivo.". Caso seja negativo, imprima "O número é negativo.".
2. **switch-case** Escolha de Opção
Crie um programa em Java que declare uma variável inteira chamada opcao e atribua a ela um valor entre 1 e 3. Utilizando a estrutura de controle switch-case, imprima uma mensagem diferente para cada valor da opção. Por exemplo, para opcao igual a 1, imprima "Você escolheu a opção 1.". Para opcao igual a 2, imprima "Você escolheu a opção 2.". Para opcao igual a 3, imprima "Você escolheu a opção 3.". Caso o valor da opção seja diferente de 1, 2 ou 3, imprima "Opção inválida.".
3. **while** Contagem Regressiva
Crie um programa em Java que utilize o laço while para realizar uma contagem regressiva de 10 a 1. Imprima cada número da contagem regressiva em uma linha separada.
4. **do-while** Contagem Crescente
Crie um programa em Java que utilize o laço do-while para realizar uma contagem crescente de 1 a 5. Imprima cada número da contagem crescente em uma linha separada.
5. **for** Tabuada do Número 7
Crie um programa em Java que utilize o laço for para exibir a tabuada do número 7. Imprima a tabuada de 1 a 10, exibindo a multiplicação do número 7 pelo contador do laço (de 1 a 10) em cada linha. Por exemplo, a primeira linha deve exibir "7 x 1 = 7", a segunda linha "7 x 2 = 14" e assim por diante.