package model;

public class Circulo {
    public double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getPerimetro() {
        return 2 * 3.14d * raio;
    }

    public double getArea() {
        return 3.14d * Math.pow(raio,2);
    }
}
