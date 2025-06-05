package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        //Set<String> lista = new HashSet<>();
        Set<String> lista = new TreeSet<>();

        lista.add("Gabriel");
        lista.add("Alexandre");
        lista.add("Vieira");
        lista.add("Juliana");
        System.out.println("Conjunto: " + lista.size());
        System.out.println(lista.remove("Teste"));
        System.out.println(lista);

        for(String s : lista) {
            System.out.println(s);
        }
    }
}
