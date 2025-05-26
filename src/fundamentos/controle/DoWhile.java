package fundamentos.controle;

public class DoWhile {
    public static void main(String[] args) {
        int contador = 1;
        do {
            System.out.printf("Contador = %d\n", contador);
            contador++;
        } while (contador <= 10);

        int numero = 0;
        do {
            System.out.println("Este bloco será executado pelo menos uma vez.");
        } while (numero > 0);
    }
}
