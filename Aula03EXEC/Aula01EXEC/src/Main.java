
public class Main {
    public static void main(String[] args) {
        double nota1, nota2, media;
        final double PESO_NOTA = 0.5;

        nota1 = 10;
        nota2 = 10;

        media = (nota1 * PESO_NOTA) + (nota2 * PESO_NOTA);

        System.out.println("A média é: ");
        System.out.println(media);
    }
}