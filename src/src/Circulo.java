package src;

public class Circulo {

    protected double radio;

    protected Circulo(double radio) {
        this.radio = radio;
    }

    protected double calcularArea() {
        return 3.1416 * radio * radio;
    }

    protected double calcularPerimetro() {
        return 2 * 3.1416 * radio;
    }

    protected void dibujar() {
        System.out.println("Dibujando circulo de radio " + radio);
    }
}