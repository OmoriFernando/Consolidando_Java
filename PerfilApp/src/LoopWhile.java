import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliacao para o filme ou -1 para encerrar.");
            nota = teclado.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }

        }
        System.out.println();
        System.out.println(mediaAvaliacao/totalDeNotas);
    }
}
