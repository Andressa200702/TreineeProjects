// Sistema de validação de senha, cpf e conferir se o numero é primo ou não
import java.util.Scanner;
public class Mainlx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SEJA BEM-VINDO AO SISTEMA ===");
        System.out.println("=== Vamos começar o cadastro ===");

        System.out.println("Digite o nome:");
        String nome = sc.nextLine();

        System.out.println("Digite a idade:");
        int idade = Integer.parseInt(sc.nextLine());

        System.out.println("Digite a média:");
        double media = Double.parseDouble(sc.nextLine());

        System.out.println("Digite o CPF:");
        String cpf = sc.nextLine();

        try {
            AlunosTwo aluno = new AlunosTwo(nome, idade, media, cpf);

            System.out.println("Aluno cadastrado com sucesso!");
            System.out.println("Nome: " + aluno.getNome());

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}

