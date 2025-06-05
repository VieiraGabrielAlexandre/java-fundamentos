package oo.abstracao;

public class Teste {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        System.out.println(cachorro.respirar());
        System.out.println(cachorro.mover());
        System.out.println(cachorro.mamar());

        // Exemplo de uso de classe abstrata
        Animal animal = new Cachorro();
        System.out.println(animal.respirar());
        System.out.println(animal.mover());

        // animal.mamar(); // Isso não compila, pois mamar() é específico de Mamíferos
    }
}
