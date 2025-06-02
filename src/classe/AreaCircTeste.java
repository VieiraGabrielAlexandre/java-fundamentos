package classe;

public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc a1 = new AreaCirc(10);
        System.out.println("Área do círculo com raio " + a1.raio + ": " + a1.Area());

        AreaCirc a2 = new AreaCirc(5);
        System.out.println("Área do círculo com raio " + a2.raio + ": " + a2.Area());

        System.out.println("Valor de pi: " + AreaCirc.pi);
    }
}
