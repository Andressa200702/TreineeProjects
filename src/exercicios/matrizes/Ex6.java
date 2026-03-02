//Matriz simulando banco de dados
package exercicios.matrizes;
public class Ex6 {
    public static void main(String[] args) {

        Object[][] banco = {
                {"Arroz", 10, 20.50},
                {"Feijão", 5, 8.99},
                {"Macarrão", 7, 5.75}
        };

        System.out.println("Estoque:");
        System.out.println("---------------------------");

        for (int i = 0; i < banco.length; i++) {
            System.out.println(
                    "Nome: " + banco[i][0] +
                            " | Quantidade: " + banco[i][1] +
                            " | Preço: R$ " + banco[i][2]
            );
        }
    }
}
