package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    String obterDataFormatada() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    String obterDataFormatada(String separador) {
        return String.format("%02d%s%02d%s%04d", dia, separador, mes, separador, ano);
    }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    Data() {
        this(1, 1, 1970);
    }
}
