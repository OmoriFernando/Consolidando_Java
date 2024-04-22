import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, digite um numero para calcular o fatorial: ");
        int num = teclado.nextInt();

        for (int i = num - 1; i > 0; i--) {
            num *= i;
        }
        System.out.println(num);
    }
}