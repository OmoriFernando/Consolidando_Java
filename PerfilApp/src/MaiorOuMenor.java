import java.util.Scanner;

public class MaiorOuMenor {
        public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
            System.out.print("Digite um numero: ");
            int number1 = read.nextInt();
            System.out.print("Digite outro numero: ");
            int number2 = read.nextInt();

            if (number1 > number2) {
                System.out.println("São números diferentes!");
                System.out.println("Primeiro numero é maior!");
            } else if (number1 < number2) {
                System.out.println("São números diferentes!");
                System.out.println("Segundo numero é maior!");
            } else if (number1 == number2) {
                System.out.println("Numeros são iguais!");
            }
        }
    }