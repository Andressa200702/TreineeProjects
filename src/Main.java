import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         Scanner cc= new Scanner(System.in);

         Alunos[] alunos = new Alunos[3];

         for (int i = 0; i < alunos.length; i++){

             alunos[i] = new Alunos();

             System.out.println("Nome: ");
             alunos[i].nome = cc.nextLine();

             System.out.println("Idade: ");
             alunos[i].idade = cc.nextInt();

             System.out.println("Média: ");
             alunos[i].media = cc.nextDouble();

             cc.nextLine();
         }

         System.out.println("\nLista de alunos:");

         for (int i = 0; i < alunos.length; i++) {
             System.out.println("Nome: " + alunos[i].nome);
             System.out.println("Idade: " + alunos[i].idade);
             System.out.println("Média: " + alunos[i].media);
             System.out.println("----------------");
         }
    }
}
