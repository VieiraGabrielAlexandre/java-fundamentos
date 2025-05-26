package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)
        boolean terca = true;
        boolean quinta = true;
        boolean tv50 = terca && quinta;
        boolean tomousorvete = terca || quinta;

        System.out.println("Comprou a tv de 50 ? " + tv50);
        System.out.println("Tomou sorvete ? "+ tomousorvete);
    }
}
