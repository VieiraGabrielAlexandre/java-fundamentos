package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<String>();

        livros.add("O Senhor dos Anéis");
        livros.push("Harry Potter");
        livros.push("O Hobbit");
        System.out.println(livros);
        System.out.println(livros.peek());

        System.out.println(livros.pop());
        System.out.println(livros.poll());

        System.out.println(livros.peek());
    }
}
