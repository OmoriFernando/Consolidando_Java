import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, digite um numero: ");
        int num = teclado.nextInt();
        System.out.println();

        if (num % 2 == 0) {
            System.out.println("Numero PAR!");
        } else {
            System.out.println("Numero IMPAR!");
        }
    }
}
