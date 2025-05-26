package fundamentos.controle;

public class For2 {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i -= 2) {
            System.out.println("Valor de i: " + i);
        }

        // Loop infinito com break
        for (; true;) {
            System.out.println("Fim do loop infinito");
            break; // Para evitar um loop infinito, adicionamos um break
        }
    }
}
