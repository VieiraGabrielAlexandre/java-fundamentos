package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        System.out.println("2" == "2");

        String s1 = new String("2");
        System.out.println("2" == s1); // Comparação de referência, não de valor
        System.out.println("2".equals(s1)); // Comparação de valor, correta para strings

        Scanner entrada = new Scanner(System.in);

        String s2 = entrada.nextLine();
        System.out.println("2" == s2); // Comparação de referência, não de valor
        System.out.println("2".equals(s2.trim())); // Comparação de valor, correta para strings

        entrada.close();
    }
}
