package fundamentos.controle;

public class DesafioFor {
    public static void main(String[] args) {
        String texto = "#";

        // fazer não usando valor numerico
        for (String v = texto; v.length() <= 10; v += "#") {
            System.out.println(v);
        }
    }
}
