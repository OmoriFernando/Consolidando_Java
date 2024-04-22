import java.util.Scanner;

public class ScannerLeitura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu filme favorito: ");
        String filme = teclado.nextLine();
        System.out.println("Qual o ano de lancamento? ");
        int anoDeLancamento = teclado.nextInt();
        System.out.println("Diga a sua avaliacao para o filme: ");
        double avaliacao = teclado.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}
