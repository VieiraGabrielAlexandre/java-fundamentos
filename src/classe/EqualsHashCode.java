package classe;

public class EqualsHashCode {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Gabriel";
        u1.email = "teste@teste";

        Usuario u2 = new Usuario();
        u2.nome = "Gabriel teste";
        u2.email = "teste@teste123";

        if (u1 == u2) {
            System.out.println("Sao iguais (==)");
        } else {
            System.out.println("Sao diferentes (==)");
        }

        if (u1.equals(u2)) {
            System.out.println("Sao iguais (equals)");
        } else {
            System.out.println("Sao diferentes (equals)");
        }
    }
}
