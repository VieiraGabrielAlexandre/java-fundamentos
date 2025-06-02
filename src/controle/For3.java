package controle;

public class For3 {
    public static void main(String[] args) {
        int i = 0;
        for (; i < 10; i++) {
            System.out.println("Valor de i: " + i);
            for (int j = 0; j < 5; j++) {
                System.out.println("  Valor de j: " + j + " (i = " + i + ")");
            }
        }
    }
}
