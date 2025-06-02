package controle;

import java.util.Scanner;

public class DesafioFinal1 {
    public static void main(String[] args) {
        // 1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número entre 0 e 10: ");
        int numero = entrada.nextInt();

        if (numero < 0 || numero > 10) {
            System.out.println("Número inválido. Deve ser entre 0 e 10.");
        } else if (numero % 2 == 0) {
            System.out.println("Número " + numero + " é par!");
        } else {
            System.out.println("Número " + numero + " não é par.");
        }
    }
}
