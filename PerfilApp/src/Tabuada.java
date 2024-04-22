import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, diga um numero para a tabuada: ");
        int num = teclado.nextInt();
        int iterador = 0;

        for (int i = 0; i <= 10; i++) {
            int res = num * i;
            System.out.println(res);
        }
        System.out.println();
        System.out.println();

        while (iterador <= 10) {
            int res = num * iterador;
            System.out.println(res);
            iterador++;
        }
    }
}
