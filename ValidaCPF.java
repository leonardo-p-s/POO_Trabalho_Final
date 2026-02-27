// Código encontrado em:
// https://www.devmedia.com.br/validando-o-cpf-em-uma-aplicacao-java/22097
// [revisada]

public class ValidaCPF {

    public static boolean isCPF(String CPF) {
        // considera-se inválido CPFs formados por uma sequência de números iguais
        if (CPF.equals("00000000000") ||
            CPF.equals("11111111111") ||
            CPF.equals("22222222222") || CPF.equals("33333333333") ||
            CPF.equals("44444444444") || CPF.equals("55555555555") ||
            CPF.equals("66666666666") || CPF.equals("77777777777") ||
            CPF.equals("88888888888") || CPF.equals("99999999999") ||
            (CPF.length() != 11))
            return false;

        char dig10, dig11;
        int sm, i, r, num, peso;

        try {
            // Cálculo do 1º dígito verificador
            sm = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {
                num = CPF.charAt(i) - 48; // converte caractere para número
                sm += (num * peso);
                peso--;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else
                dig10 = (char)(r + 48);

            // Cálculo do 2º dígito verificador
            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = CPF.charAt(i) - 48;
                sm += (num * peso);
                peso--;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig11 = '0';
            else
                dig11 = (char)(r + 48);

            // Verifica se os dígitos calculados conferem com os informados
            return (dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10));

        } catch (Exception erro) {
            return false;
        }
    }

    public static String imprimeCPF(String CPF) {
        return CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
               CPF.substring(6, 9) + "-" + CPF.substring(9, 11);
    }
}
