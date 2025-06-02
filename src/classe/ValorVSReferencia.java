package classe;

public class ValorVSReferencia {
    public static void main(String[] args) {
        double a = 2.0;
        double b = a; // b recebe o valor de a, não uma referência

        a++;
        b--;
        System.out.println(a + " " + b);

        Data d1 = new Data(1, 2, 2023);
        Data d2 = d1; // d2 recebe a referência de d1, ambos apontam para o mesmo objeto

        d1.dia = 31; // Modifica o dia de d1, o que também afeta d2
        System.out.println(d1.obterDataFormatada());

        System.out.println(d2.obterDataFormatada());

        valorVsReferencia(d1); // Passa d1 para o método, que modifica o objeto referenciado
        System.out.println(d1.obterDataFormatada()); // Verifica se d1 foi modificado
    }

    static void valorVsReferencia(Data d) {
        d.dia = 30; // Modifica o dia do objeto referenciado por d
        d.mes = 6;
        d.ano = 2002; // Modifica o ano do objeto referenciado por d
    }
}
