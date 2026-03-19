package src;

public class Triangulo {

    protected double base;

    protected double altura;

    protected double lado1;

    protected double lado2;

    protected double lado3;

    protected Triangulo(double base, double altura, double l1, double l2, double l3) {
        this.base = base;

        this.altura = altura;

        this.lado1 = l1;

        this.lado2 = l2;

        this.lado3 = l3;

    }

    protected double calcularArea() {
        return (base * altura) / 2;
    }

    protected double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    protected void dibujar() {
        System.out.println("Dibujando triangulo");
    }
}