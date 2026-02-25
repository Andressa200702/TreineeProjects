public class AlunosTwo {

    private String nome;
    private int idade;
    private double media;
    private String cpf;

    // Construtor
    public AlunosTwo(String nome, int idade, double media, String cpf) {

        if (!Validacao.validarIdade(idade)) {
            throw new IllegalArgumentException("Idade inválida.");
        }

        if (!Validacao.validarCPF(cpf)) {
            throw new IllegalArgumentException("CPF inválido.");
        }

        this.nome = nome;
        this.idade = idade;
        this.media = media;
        this.cpf = cpf;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getMedia() {
        return media;
    }

    public String getCpf() {
        return cpf;
    }
}

