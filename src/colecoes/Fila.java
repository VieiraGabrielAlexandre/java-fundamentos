package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Gabriel");
        fila.offer("Alexandre");
        fila.add("Vieira");
        fila.offer("Juliana");
        fila.add("Juliana");

        System.out.println(fila.peek());
        System.out.println(fila.poll());
        System.out.println(fila.element());

    }
}
