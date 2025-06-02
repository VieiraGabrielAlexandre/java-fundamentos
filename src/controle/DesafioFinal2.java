package controle;

public class DesafioFinal2 {
    public static void main(String[] args) {
        // 2. Criar um programa informa se o ano atual é um ano bissexto;

        int anoAtual = 2024; // Exemplo de ano atual
        boolean isBissexto = (anoAtual % 4 == 0 && anoAtual % 100 != 0) || (anoAtual % 400 == 0);
        if (isBissexto) {
            System.out.println("O ano " + anoAtual + " é um ano bissexto.");
        } else {
            System.out.println("O ano " + anoAtual + " não é um ano bissexto.");
        }
    }
}
