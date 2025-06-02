package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 15;
        d1.mes = 8;
        d1.ano = 2023;

        Data d2 = new Data();
        d2.dia = 25;
        d2.mes = 12;
        d2.ano = 2023;

        System.out.printf("Data 1: %02d/%02d/%04d\n", d1.dia, d1.mes, d1.ano);
        System.out.printf("Data 2: %02d/%02d/%04d\n", d2.dia, d2.mes, d2.ano);

        System.out.println("Data 1 formatada: " + d1.obterDataFormatada());
        System.out.println("Data 2 formatada: " + d2.obterDataFormatada());
        System.out.println("Data 1 formatada com separador '-': " + d1.obterDataFormatada("-"));
        System.out.println("Data 2 formatada com separador '*': " + d2.obterDataFormatada("*"));

        Data d3 = new Data(31, 12, 2023);
        System.out.printf("Data 3: %02d/%02d/%04d\n", d3.dia, d3.mes, d3.ano);
        Data d4 = new Data();
        System.out.printf("Data 4: %02d/%02d/%04d\n", d4.dia, d4.mes, d4.ano);
    }
}
