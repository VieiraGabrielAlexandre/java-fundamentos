package fundamentos.operadores;

public class DesafioAritmeticos {
    public static void main(String[] args) {
        int a = 6;
        int b = (3 + 2);
        int c = 3 * 2;
        int ab = (int) Math.pow(a * b, 2);
        int abc = ab / c;
        //

        int d = (1 - 5);
        int e = (2 - 7);
        int de = d * e;
        int f = 2;
        int def = de / f;
        int defg = (int) Math.pow(def, 2);

        System.out.println(abc);
        System.out.println(defg);

        int abcdefg = abc - defg;
        System.out.println(abcdefg);

        int h = (int) Math.pow(abcdefg, 3);
        System.out.println(h);

        int i = (int) Math.pow(10, 3);

        int j = h / i;
        System.out.println(j);
    }
}
