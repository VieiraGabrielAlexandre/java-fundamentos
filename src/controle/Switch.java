package controle;

public class Switch {
    public static void main(String[] args) {
        int valor = 10;

        switch (valor) {
            case 1:
                System.out.println("Valor é 1");
                break;
            case 2:
                System.out.println("Valor é 2");
                break;
            case 3:
                System.out.println("Valor é 3");
                break;
            default:
                System.out.println("Valor não é 1, 2 ou 3");
                break;
        }
    }
}
