package fundamentos.operadores;

public class Ternario {
    public static void main(String[] args) {
        double media = 7.6;
        String resultado = media >= 7.0 ? "Aprovado" : "Reprovado";
        System.out.println("O aluno está: " + resultado);

        int a = 3;
        int b = 4;
        String maior = a > b ? "A é maior que B" : "B é maior que A";
        System.out.println(maior);
    }
}
