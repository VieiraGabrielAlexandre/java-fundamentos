package fundamentos.controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a média do aluno: ");
        double media = entrada.nextDouble();

        if (media >= 7.0) {
            System.out.println("Aprovado!");
        } else if (media >= 5.0) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }

        entrada.close();
    }
}
