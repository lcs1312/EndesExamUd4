package src;

public class Rectangulo {

    protected double ancho;
    protected double alto;

    protected Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    protected double calcularArea() {
        return ancho * alto;
    }

    protected double calcularPerimetro() {
        return 2 * ancho + 2 * alto;
    }

    protected void dibujar() {
        System.out.println("Dibujando rectangulo " + ancho + "x" + alto);
    }
}