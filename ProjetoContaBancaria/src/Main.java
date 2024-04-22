import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome = "Arthur";
        String conta = "Poupança";
        int saldo = 2500;
        int opcao = 0;

        System.out.println("**********************************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println();

        System.out.println("Nome:             " + nome);
        System.out.println("Tipo de conta:    " + conta);
        System.out.println("Saldo inicial:    R$ " + saldo);
        System.out.println();
        System.out.println("*********************************");
        System.out.println();
        System.out.println();

        while (opcao != 4) {
            System.out.println("Operações");
            System.out.println();
            System.out.println("1- Consultar saldo");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir saldo");
            System.out.println("4- Sair");
            System.out.println();

            System.out.print("Digite a opção desejada: ");
            opcao = teclado.nextInt();
            System.out.println();

            if (opcao == 1) {
                System.out.println("R$ " + saldo);
                System.out.println();
            } else if (opcao == 2) {
                System.out.println("Informe o valor a receber: ");
                int valorReceber = teclado.nextInt();
                saldo += valorReceber;
                System.out.println();
                System.out.println("Saldo atualizado: R$ " + saldo);
                System.out.println();
            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja tranferir: ");
                int valorTransferir = teclado.nextInt();
                if (valorTransferir <= saldo) {
                    saldo -= valorTransferir;
                    System.out.println();
                    System.out.println("Saldo atualizado R$ " + saldo);
                    System.out.println();
                } else {
                    System.out.println("Não há saldo suficiente.");
                }
            } else if (opcao == 4){
                System.out.println("Terminado.");
            } else {
                System.out.println("Opção inválida. Escolha uma opção válida.");
            }
        }
        teclado.close();
    }
}