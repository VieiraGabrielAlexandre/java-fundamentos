package fundamentos.controle;

import java.util.Scanner;

public class WhileInderteminado {
    public static void main(String[] args) {
        System.out.println("Digite algo (sair para encerrar):");
        Scanner scanner = new Scanner(System.in);

        String valor = "";
        while(!valor.equalsIgnoreCase("sair")) {
            valor = scanner.nextLine();
            System.out.println("Você digitou: " + valor);
        }
    }
}
