public class Validacao {
    public static boolean main(String[] args) {

        if (senha.length() < 8) {
            return false;
        }
        boolean comNumero = false;
        boolean comLetram = false;

        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);

            if (Character.isDigit(c)) {
                comNumero = true;
            }

            if (Character.isUpperCase(c)) {
                comLetram = true;
            }
        }

        return comNumero && comLetram;
    }


    }
}
