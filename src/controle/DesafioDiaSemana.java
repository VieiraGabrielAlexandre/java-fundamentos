package controle;

import javax.swing.*;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        String dia = JOptionPane.showInputDialog("Informe o dia da semana :");

        if (dia.equalsIgnoreCase("domingo")) {
            System.out.println("1 - Domingo");
        } else if (dia.equalsIgnoreCase("segunda")) {
            System.out.println("2 - Segunda-feira");
        } else if (dia.equalsIgnoreCase("terça")) {
            System.out.println("3 - Terça-feira");
        } else if (dia.equalsIgnoreCase("quarta")) {
            System.out.println("4 - Quarta-feira");
        } else if (dia.equalsIgnoreCase("quinta")) {
            System.out.println("5 - Quinta-feira");
        } else if (dia.equalsIgnoreCase("sexta")) {
            System.out.println("6 - Sexta-feira");
        } else if (dia.equalsIgnoreCase("sábado")) {
            System.out.println("7 - Sábado");
        } else {
            System.out.println("Dia inválido!");
        }
    }
}
