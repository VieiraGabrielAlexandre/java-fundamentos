package classe;

public class Jantar {
    public static void main(String[] args) {
        Comida comida1 = new Comida("Arroz", 0.300);
        Comida comida2 = new Comida("Feijão", 0.150);
        Comida comida3 = new Comida("Macarrão", 0.200);

        Pessoa pessoa1 = new Pessoa("João", 70.0);
        Pessoa pessoa2 = new Pessoa("Maria", 60.0);



        System.out.println(pessoa1.comer(comida1));
        System.out.println(pessoa1.comer(comida2));
        System.out.println(pessoa1.comer(comida3));

    }
}
