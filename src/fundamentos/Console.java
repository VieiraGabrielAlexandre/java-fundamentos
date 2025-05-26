package fundamentos;

import java.util.Arrays;
import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.println("Bom dia !\n");
        System.out.printf("Mega senha: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);

        entrada.close();
    }
}
