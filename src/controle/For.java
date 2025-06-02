package controle;

public class For {
    public static void main(String[] args) {
        for(int contador = 1; contador <= 10; contador++) {
            System.out.printf("Contador = %d\n", contador);
        }

        for(;true;) {
            System.out.println("Fim do loop infinito");
            break; // Para evitar um loop infinito, adicionamos um break
        }
    }
}
