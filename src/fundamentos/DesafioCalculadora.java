package fundamentos;

import javax.swing.*;

public class DesafioCalculadora {
    public static void main(String[] args) {
        String primeiroNumero = JOptionPane.showInputDialog("Digite o primeiro número: ");
        String segundoNumero = JOptionPane.showInputDialog("Digite o segundo número: ");
        String operacao = JOptionPane.showInputDialog("Digite a operação (+, -, *, /): ");
        double num1 = Double.parseDouble(primeiroNumero);
        double num2 = Double.parseDouble(segundoNumero);
        double resultado;

        //sem if, switch
        resultado = operacao.equals("+") ? num1 + num2 :
                   operacao.equals("-") ? num1 - num2 :
                   operacao.equals("*") ? num1 * num2 :
                   operacao.equals("/") ? num1 / num2 :
                   Double.NaN; // Valor inválido se a operação não for reconhecida

        String mensagem = String.format("Resultado: %.2f %s %.2f = %.2f", num1, operacao, num2, resultado);

        System.out.println(mensagem);
    }
}
