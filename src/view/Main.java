package view;

import model.Circulo;

public class Main {

    public static void main(String[] args) {
        Circulo c1;
        c1 = new Circulo(4);
        System.out.println("Perimetro: " + c1.getPerimetro() + "\nArea: " + c1.getArea());
    }
}
