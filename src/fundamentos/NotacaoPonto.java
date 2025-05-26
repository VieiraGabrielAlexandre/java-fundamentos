package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        String nome = "Gabriel";
        int tamanho = nome.length();

        System.out.println("tamanho: " + tamanho);

        String sobrenome = "Alexandre Vieira";

        System.out.println(sobrenome.replace("Alexandre ", "").toUpperCase());
    }
}
