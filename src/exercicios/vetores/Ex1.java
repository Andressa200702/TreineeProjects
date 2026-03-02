//Multiplicação do vetor [1,2] por 2
package exercicios.vetores;
public class Ex1 {
    public static void main(String[] args) {

        int[] vetor = {1, 2};
        int multiplicador = 2;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] *= multiplicador;
        }

        System.out.println("Resultado:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}

