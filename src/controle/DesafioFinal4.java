package controle;

import java.util.Scanner;

public class DesafioFinal4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número para verificar se é primo: ");
        int numero = entrada.nextInt();

        boolean ehPrimo = true;

        if (numero <= 1) {
            System.out.println("Número inválido. Deve ser maior que 1.");
            ehPrimo = false;
        } else {
            for (int i = 2; i <= (int) Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    System.out.println("Não é primo, pois é divisível por " + i);
                    break;
                }
            }
        }

        if (ehPrimo && numero > 1) {
            System.out.println("É primo.");
        }

        entrada.close();
    }
}
