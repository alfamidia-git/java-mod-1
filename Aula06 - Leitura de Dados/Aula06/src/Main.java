import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Digite a sua idade:");
        int idade = sc.nextInt();
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