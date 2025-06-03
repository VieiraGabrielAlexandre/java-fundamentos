package arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos alunos: ");
        int quantidadeAlunos = scanner.nextInt();
        System.out.println("Quantas notas por aluno: ");
        int quantidadeNotas = scanner.nextInt();

        double[][] notas = new double[quantidadeAlunos][quantidadeNotas];
        for (int i = 0; i < quantidadeAlunos; i++) {
            for (int j = 0; j < quantidadeNotas; j++) {
                System.out.printf("Digite a nota %d do aluno %d: ", j + 1, i + 1);
                notas[i][j] = scanner.nextDouble();
            }
        }

        double[] medias = new double[quantidadeAlunos];
        for (int i = 0; i < quantidadeAlunos; i++) {
            double soma = 0;
            for (int j = 0; j < quantidadeNotas; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma / quantidadeNotas;
        }

        System.out.println("Medias dos alunos:");
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.printf("Aluno %d: %.2f%n", i + 1, medias[i]);
        }

        scanner.close();
    }
}
