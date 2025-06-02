package controle;

import java.util.Scanner;

public class DesafioFinal5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número para verificar se é primo: ");
        int numero = entrada.nextInt();

        boolean ehPrimo = true;

        switch (numero) {
            case 0:
            case 1:
                System.out.println("Número inválido. Deve ser maior que 1.");
                ehPrimo = false;
                break;
            case 2:
                System.out.println("É primo, pois é o único número par primo.");
                ehPrimo = false;
                break;
            default:
                if (numero % 2 == 0) {
                    System.out.println("Não é primo, pois é divisível por 2.");
                    ehPrimo = false;
                } else {
                    for (int i = 3; i <= Math.sqrt(numero); i += 2) {
                        if (numero % i == 0) {
                            System.out.println("Não é primo, pois é divisível por " + i);
                            ehPrimo = false;
                            break;
                        }
                    }
                }
        }

        if (ehPrimo) {
            System.out.println("É primo.");
        }

        entrada.close();
    }
}
