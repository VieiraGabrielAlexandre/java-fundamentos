package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Gabriel");
        usuarios.put(2, "Alexandre");
        usuarios.put(3, "Vieira");

        System.out.println(usuarios);
        usuarios.put(1, "Juliana");
        System.out.println(usuarios);

        System.out.println(usuarios.size());
        System.out.println(usuarios.get(1));
        System.out.println(usuarios.get(33)); // Retorna null se a chave não existir
        System.out.println(usuarios.containsKey(1)); // Verifica se a chave existe
        System.out.println(usuarios.containsValue("Juliana")); // Verifica se o valor existe
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.entrySet());

        for(int chave: usuarios.keySet()){
            System.out.println("ID:" + chave);
        }

        for(String nome: usuarios.values()){
            System.out.println("Nome:" + nome);
        }

        for(Map.Entry<Integer, String> usuario: usuarios.entrySet()){
            System.out.println("Nome: " + usuario.getValue() + " - ID: " + usuario.getKey());
        }
    }
}
