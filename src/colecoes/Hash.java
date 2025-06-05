package colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<Usuario>();

        usuarios.add(new Usuario("Gabriel"));
        usuarios.add(new Usuario("Alexandre"));
        usuarios.add(new Usuario("Vieira"));

        boolean resultado = usuarios.contains(new Usuario("Gabriel"));
        System.out.println(resultado); // true, se o equals estiver implementado corretamente
    }
}
