//Soma de matrizes 2x2
package exercicios.matrizes;
public class Ex4 {
    public static void main(String[] args) {

        int[][] m1 = {
                {1, 2},
                {3, 4}
        };

        int[][] m2 = {
                {5, 6},
                {7, 8}
        };

        int[][] soma = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                soma[i][j] = m1[i][j] + m2[i][j];
            }
        }

        System.out.println("Matriz Soma:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(soma[i][j] + " ");
            }
            System.out.println();
        }
    }
}
