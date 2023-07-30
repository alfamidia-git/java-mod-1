
public class Main {
    public static void main(String[] args) {


        //EXERCICIO 1
        System.out.println("EXERCICIO 1");
        int numero = 0;

        if(numero > 0){
            System.out.println("O número é positivo");
        }else if(numero < 0) {
            System.out.println("O número é negativo");
        }else{
            System.out.println("O número é o 0");
        }


        System.out.println("-------------------------------------------");
        //EXERCICIO 2
        System.out.println("EXERCICIO 2");

        int opcao = 4;

        switch (opcao){
            case 1:
                System.out.println("Você escolheu a opção 1");
                break;
            case 2:
                System.out.println("Você escolheu a opção 2");
                break;
            case 3:
                System.out.println("Você escolheu a opção 3");
                break;
            default:
                System.out.println("Você escolheu uma opção inválida.");
        }


        System.out.println("-------------------------------------------");
        // EXERCICIO 3
        System.out.println("EXERCICIO 3");

        int contagemWhile = 10;
        System.out.println("Iniciando contagem regressiva");
        while (contagemWhile > 0){
            System.out.println(contagemWhile);
            contagemWhile--;
        }
        System.out.println("Fim da contagem regressiva");

        System.out.println("-------------------------------------------");

        // EXERCICIO 4
        System.out.println("EXERCICIO 4");
        System.out.println("Iniciando contagem regressiva");
        int contagemDoWhile = 1;

        do {
            System.out.println(contagemDoWhile);
            contagemDoWhile++;
        }while(contagemDoWhile < 6);
        System.out.println("Fim da contagem regressiva");

        System.out.println("-------------------------------------------");

        // EXERCICIO 5
        System.out.println("EXERCICIO 5");
        System.out.println("Tabuada do 7");
        for(int i = 1; i < 11; i++){
            System.out.println(" 7x" + i + "=" + (7 * i));
        }

    }
}