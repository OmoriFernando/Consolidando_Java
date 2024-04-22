import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliacao para o filme ");
            nota = teclado.nextDouble();
            mediaAvaliacao += nota;
        }
            System.out.println();
            System.out.println(mediaAvaliacao/3);
    }
}
