import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;

        do{
            System.out.println("Você deseja continuar?");
            System.out.println("1 - SIM");
            System.out.println("2 - NÃO");

            int opcaoUsuario = sc.nextInt();

            if(opcaoUsuario == 1){
                System.out.println("Digite um número: ");
                double valor1 = sc.nextDouble();

                System.out.println("Digite outro número: ");
                double valor2 = sc.nextDouble();

                System.out.println("Qual operação matemática você deseja realizar?");
                System.out.println("1 - SOMA");
                System.out.println("2 - SUBTRAÇÃO");
                System.out.println("3 - MULTIPLICAÇÃO");
                System.out.println("4 - DIVISÃO");

                int operacao = sc.nextInt();
                double resultado = 0;
                switch(operacao){
                    case 1:
                        resultado = valor1 + valor2;
                        break;
                    case 2:
                        resultado = valor1 - valor2;
                        break;
                    case 3:
                        resultado = valor1 * valor2;
                        break;
                    case 4:
                        resultado = valor1 / valor2;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }

                System.out.println("O resultado é: " + resultado);

            } else if (opcaoUsuario == 2) {
                System.out.println("Obrigado. Tenha um ótimo dia.");
                continuar = false;
            }else{
                System.out.println("Opção inválida");
            }


        }while(continuar);
    }
}