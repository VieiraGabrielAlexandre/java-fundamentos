package classe;

public class AreaCirc {
    double raio;
    final static double pi = 3.14; // Valor fixo de pi

    AreaCirc(double raio){
        this.raio = raio;
    }

    double Area() {
        return pi * Math.pow(raio, 2);
    }
}
