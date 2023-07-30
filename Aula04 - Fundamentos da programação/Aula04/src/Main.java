public class Main {

    public static void main(String[] args) {
        //EXEMPLO 1
//        int idade = 17;
//
//        if (idade >= 18) {
//            System.out.println("Você é maior de idade.");
//        } else {
//            System.out.println("Você é menor de idade.");
//        }

        //EXEMPLO 2
//        int numero = 80;
//
//        if (numero % 2 == 0) {
//            System.out.println("O número digitado é par.");
//        } else {
//            System.out.println("O número digitado é ímpar.");
//        }

//        //EXEMPLO 3
//        int idade = -40;
//
//        if (idade < 0) {
//            System.out.println("Idade inválida. Digite um valor positivo.");
//        } else if (idade < 18) {
//            System.out.println("Você é menor de idade.");
//        } else if (idade < 65) {
//            System.out.println("Você é adulto.");
//        } else {
//            System.out.println("Você é idoso.");
//        }


        // EXEMPLO 4 - SWITCH
//        int numeroDia = 1;
//
//        String diaSemana;
//
//        switch (numeroDia) {
//            case 1:
//                diaSemana = "Domingo";
//                break;
//            case 2:
//                diaSemana = "Segunda-feira";
//                break;
//            case 3:
//                diaSemana = "Terça-feira";
//                break;
//            case 4:
//                diaSemana = "Quarta-feira";
//                break;
//            case 5:
//                diaSemana = "Quinta-feira";
//                break;
//            case 6:
//                diaSemana = "Sexta-feira";
//                break;
//            case 7:
//                diaSemana = "Sábado";
//                break;
//            default:
//                diaSemana = "Dia inválido";
//                break;
//        }
//
//        System.out.println("O dia da semana correspondente é: " + diaSemana);


        //EXEMPLO 4 - WHILE
//        int numero = 5;
//
//        System.out.println("Contagem regressiva iniciada:");
//
//        while (numero >= 1) {
//            System.out.println(numero);
//            numero--;
//        }
//
//        System.out.println("Contagem regressiva concluída.");

        //EXEMPLO 5 - DO-WHILE
//        int numero = 0;
//
//        System.out.println("Contagem regressiva iniciada:");
//
//        do {
//            System.out.println(numero);
//            numero--;
//        } while (numero >= 1);
//
//        System.out.println("Contagem regressiva concluída.");


        int soma = 0;

        System.out.println("Calculando a soma dos números de 1 a 10:");

        for (int numero = 1; numero <= 10; numero++) {
            soma += numero;
        }

        System.out.println("A soma dos números de 1 a 10 é: " + soma);

    }
}