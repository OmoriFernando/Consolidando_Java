import java.util.Scanner;

public class QuadradoCirculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Você deseja calcular área do quadrado ou do circulo?");
        String resposta = teclado.nextLine();

        if (resposta.equals("quadrado")) {
            System.out.print("Por favor, diga o valor da base: ");
            int base = teclado.nextInt();
            System.out.print("Agora o valor da altura: ");
            int altura = teclado.nextInt();
            int resQuadrado = base * altura;
            System.out.println("O resultado é: " + resQuadrado);
        } else if (resposta.equals("circulo")) {
            System.out.println("Por favor, diga o valor do raio: ");//A = π r²
            int raio = teclado.nextInt();
            int resCirculo = (int) Math.PI * (raio * raio);
            System.out.println("O resultado é: " + resCirculo);
        }
    }
}
