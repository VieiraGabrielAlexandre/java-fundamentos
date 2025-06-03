package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[4];

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8.9;
        notasAlunoA[2] = 6.9;
        notasAlunoA[3] = 10;

        System.out.println(notasAlunoA[0]);
        System.out.println(notasAlunoA[1]);
        System.out.println(notasAlunoA[2]);
        System.out.println(notasAlunoA[3]);
        System.out.println("-----");
        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println("-----");
        System.out.println("Quantidade de notas: " + notasAlunoA.length);
        System.out.println("-----");
        double total = 0;
        for(int i = 0; i < notasAlunoA.length; i++) {
            total += notasAlunoA[i];
        }

        System.out.println("Media: " + total / notasAlunoA.length);
    }
}
