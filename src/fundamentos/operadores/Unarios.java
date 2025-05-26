package fundamentos.operadores;

public class Unarios {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        a++; // Incrementa a variável a em 1
        b--; // Decrementa a variável b em 1

        System.out.println("a = " + a); // Imprime o valor de a após o incremento
        System.out.println("b = " + b); // Imprime o valor de b após o decremento
        System.out.println("++a = " + ++a); // Pré-incremento: incrementa a antes de imprimir
        System.out.println("--b = " + --b); // Pré-decremento: decrementa b antes de imprimir
    }
}
