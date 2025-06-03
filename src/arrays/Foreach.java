package arrays;

public class Foreach {
    public static void main(String[] args) {
        double [] notasAlunoA = { 7.9, 8.9, 6.9, 10 };

        for (int i = 0; i < notasAlunoA.length; i++) {
            System.out.println(notasAlunoA[i]);
        }

        for(double nota: notasAlunoA) {
            System.out.println(nota);
        }
    }
}
