public class IfElseCondicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1986;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";
        System.out.println();

        if (anoDeLancamento >= 2022) {
            System.out.println("Lancamentos que os clientes estao curtindo!");
        } else {
            System.out.println("Filmes retro que vale a pensa assistir!");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Deve pagar alocacao!");
        }
    }
}
