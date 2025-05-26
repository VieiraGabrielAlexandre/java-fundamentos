package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá, bom dia !!".charAt(2));

        String s = "Bom dia !";
        System.out.println(s.concat("!!!!"));
        System.out.println(s + "?!?!?!");
        System.out.println(s.startsWith("Bom"));

        var nome = "Gabriel";
        var sobrenome = "Vieira";
        var idade = 29;
        var salario = 99999.89;


        String maisUmaFrase = "Nome: " + nome + "\nSobrenome: "
                + sobrenome + "\nIdade: " + idade +
                "\nSalario: " + salario + "\n\n";
        System.out.println(maisUmaFrase);

        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.",
                nome, sobrenome, idade, salario);

        String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.",
                nome, sobrenome, idade, salario);
        System.out.println(frase);

        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println("Frase qualquer".substring(6));
        System.out.println("Frase qualquer".substring(6, 10));
    }
}
