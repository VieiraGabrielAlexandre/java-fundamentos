package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite os 3 ultimos salarios: ");

        String valor1 = entrada.next().replace(",", ".");
        String valor2 = entrada.next().replace(",", ".");
        String valor3 = entrada.next().replace(",", ".");

        double valor1d = Double.parseDouble(valor1);
        double valor2d = Double.parseDouble(valor2);
        double valor3d = Double.parseDouble(valor3);

        double media = (valor1d + valor2d + valor3d) / 3;
        System.out.println("Media: " + media);
    }
}
