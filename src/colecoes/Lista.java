package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Gabriel"));
        lista.add(new Usuario("Alexandre"));
        lista.add(new Usuario("Vieira"));

        //System.out.println(lista.get(2));

        System.out.println(lista.contains(new Usuario("Gabriel")));

        for(Usuario usuario : lista) {
            System.out.println(usuario.toString());
        }
    }
}
