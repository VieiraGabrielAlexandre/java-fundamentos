package controle;

public class DesafioFinal3 {
    public static void main(String[] args) {
        // 3. Criar um programa que receba duas notas parciais, calcular a média final.
        // Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
        // se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
        // caso contrário imprime no console "Reprovado".

        double nota1 = 6.5; // Exemplo de nota 1

        if (nota1 < 0 || nota1 > 10) {
            System.out.println("Nota inválida. Deve ser entre 0 e 10.");
            return; // Encerra o programa se a nota for inválida
        }

        if (nota1 >= 7.0) {
            System.out.println("Aprovado!");
        } else if (nota1 >= 4.0) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
