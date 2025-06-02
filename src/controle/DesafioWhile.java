package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //System.out.println("Digite a quantidade de notas: ");
        //int quantidadeNotas = entrada.nextInt();
        //if (quantidadeNotas <= 0 || quantidadeNotas > 10) {
        //    System.out.println("Quantidade de notas invalida. Deve ser maior que 0 e menor ou igual a 10.");
        //    entrada.close();
        //    return;
        //}

        int contador = 1;
        int total = 0;

        while (true) {
            System.out.println("Digite a nota " + contador + ": ");
            double nota = entrada.nextDouble();
            if (nota > 10) {
                System.out.println("Nota inválida. Deve ser entre 0 e 10.");
                continue; // Pula para a próxima iteração do loop
            }

            if (nota == -1) {
                System.out.println("Total de notas: " + total);
                System.out.println("Quantidade de notas: " + contador);
                System.out.println("Encerrando o programa.");
                System.out.println("Media das notas: " + (total / --contador));
                break; // Encerra o loop se a nota for -1
            }

            System.out.println("Nota " + contador + ": " + nota);
            total += nota;
            contador++;
            System.out.println("Total de notas: " + total);
        }

        //while(contador <= quantidadeNotas) {
        //    System.out.println("Digite a nota: ");
        //    double nota = entrada.nextDouble();
        //    if (nota < 0 || nota > 10) {
        //        System.out.println("Nota inválida. Deve ser entre 0 e 10.");
        //        continue;
        //    }
        //    contador++;
        //}

        entrada.close();
    }
}
