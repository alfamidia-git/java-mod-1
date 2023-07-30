### Leitura de dados
A leitura de dados é uma das tarefas essenciais na programação, pois permite que um programa interaja com o usuário ou obtenha informações de outras fontes, como arquivos ou bancos de dados. Em Java, a leitura de dados é realizada por meio da entrada padrão, que é representada pelo objeto Scanner da biblioteca java.util.

#### Scanner
Para ler dados fornecidos pelo usuário, é necessário criar uma instância do objeto (veremos o que é um objeto nos próximos módulos) Scanner e associá-la à entrada padrão (geralmente o teclado). Uma vez criado o Scanner, é possível utilizar seus métodos para ler diferentes tipos de dados, 

###### exemplo da declaração do Scanner:
```java
import util.Scanner; //importação de outra biblioteca

public class ExemploScanner{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in); //instanciando o objeto Scanner
    }
}
```

###### métodos (funções) do Scanner:
```java
import util.Scanner;
public class ExemploScanner{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Digite sua idade:");
       int idade = sc.nextInt(); //o método nextInt pega a próxima entrada de um inteiro do usuário

       System.out.println("Digite seu peso:");
       double peso = sc.nextDouble(); // pega a próxima entrada de double do usuário
    }
}
```

###### Utlizando Scanner com estruturas de repetição:
```java
import util.Scanner;
public class ExemploScanner{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       boolean continuar = true;

       do{
            System.out.println("Você deseja sair? Digite sim ou não");
            String resposta = sc.next();

            if(resposta.equals("sim")){
                System.out.println("Obrigado. Tenha um ótimo dia!");
                continuar = false;
            }else if(resposta.equals("não")){
                System.out.println("Oba!");
            }else{
                System.out.println("Opção inválida. Tente novamente");
            }
       }while(continuar);
    }
}
```

# EXERCICIO
1. Crie um programa utilizando uma estrutura de repetição que dê a opção ao usuário de sair.
2. Se o usuário quiser continuar:
    * peça para ele digitar dois números e salve cada um em uma variável.
    * Pergunte qual operação matemática ele deseja realizar. (soma, subtração, multiplicação ou divisão)
    * Imprima o resultado condizente com a operação escolhida.
    * Volte ao inicio do loop.
3. Deixe uma mensagem de despedida e encerre o programa.