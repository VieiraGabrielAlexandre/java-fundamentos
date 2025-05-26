package fundamentos;

import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {

        //Scanner entrada = new Scanner(System.in);

        Byte b = 100;
        Short s = 1000;

        Integer i = 10000;
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.intValue());
        System.out.println(i);

        System.out.println(l * 102);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#';
        System.out.println(c + "...");
    }
}
