public class Validacao {
    public static boolean validarSenha(String senha) {

        if (senha.length() < 8) return false;

        boolean temNumero = false;
        boolean temMaiuscula = false;

        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);

            if (Character.isDigit(c)) {
                temNumero = true;
            }

            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
            }
        }
        return temNumero && temMaiuscula;
    }

    public static boolean validarIdade(int idade) {
        return idade >= 0 && idade <= 120;
    }

    public static boolean validarCPF(String cpf) {
        return cpf.length() == 11 && cpf.matches("\\d+");
    }

    public static boolean ehPrimo(int numero) {

        if (numero <= 1) return false;

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}