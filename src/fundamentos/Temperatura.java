package fundamentos;

import java.util.Arrays;

public class Temperatura {
    public static void main(String[] args) {
        //C = 5/9 x (F – 32)
        double graus = 5/9.0;
        double fahrenheit = 24 - 32;

        System.out.println("args = " + graus * (fahrenheit));

    }
}
