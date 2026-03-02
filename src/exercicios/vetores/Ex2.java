//Soma dos vetores
package exercicios.vetores;
public class Ex2 {
    public static void main() {

        int[] v1 = {1, 2};
        int[] v2 = {3, 4};
        int[] soma = new int[v1.length];

        for (int i = 0; i < v1.length; i++) {
            soma[i] = v1[i] + v2[i];
        }

        System.out.println("Vetor soma:");
        for (int num : soma) {
            System.out.print(num + " ");
        }
    }
}



