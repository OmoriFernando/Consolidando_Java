import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int number = read.nextInt();

        if (number >= 0) {
            System.out.println("Numero positivo(+)!");
        } else {
            System.out.println("Numero negativo(-)!");
        }
    }
}
