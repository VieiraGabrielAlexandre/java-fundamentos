package classe;

public class ValorNulo {
    public static void main(String[] args) {
        String s1 = "";
        System.out.println(s1.concat("!!!")); // Concatena uma string vazia com "!!!"

        String s2 = null;
        System.out.println(s2.concat("???")); // Isso causaria um NullPointerException

    }
}
