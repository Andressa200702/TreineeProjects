//Lista de Produtos e Preços (2 vetores)
package exercicios.vetores;
public class Ex3 {
    public static void main(String[] args) {

        String[] produtos = {"Arroz", "Feijão", "Macarrão"};
        double[] precos = {20.50, 8.99, 5.75};

        System.out.println("Lista de Produtos:");
        for (int i = 0; i < produtos.length; i++) {
            System.out.println(produtos[i] + " - R$ " + precos[i]);
        }
    }
}

