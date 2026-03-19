package src;

import java.util.ArrayList;

public class GestorFiguras {

    protected ArrayList<Object> figuras;

    protected GestorFiguras() {
        figuras = new ArrayList<>();
    }

    protected void agregarFigura(Object f) {
        figuras.add(f);
    }

    protected void mostrarAreas() {

        for (Object f : figuras) {

            // horrible uso de instanceof
            if (f instanceof Circulo) {
                Circulo c = (Circulo) f;
                System.out.println("Area circulo: " + c.calcularArea());
            }

            if (f instanceof Rectangulo) {
                Rectangulo r = (Rectangulo) f;
                System.out.println("Area rectangulo: " + r.calcularArea());
            }

            if (f instanceof Triangulo) {
                Triangulo t = (Triangulo) f;
                System.out.println("Area triangulo: " + t.calcularArea());
            }
        }
    }

    protected void mostrarPerimetros() {

        for (Object f : figuras) {

            if (f instanceof Circulo) {
                Circulo c = (Circulo) f;
                System.out.println("Perimetro circulo: " + c.calcularPerimetro());
            }

            if (f instanceof Rectangulo) {
                Rectangulo r = (Rectangulo) f;
                System.out.println("Perimetro rectangulo: " + r.calcularPerimetro());
            }

            if (f instanceof Triangulo) {
                Triangulo t = (Triangulo) f;
                System.out.println("Perimetro triangulo: " + t.calcularPerimetro());
            }
        }
    }

    protected void dibujarTodo() {

        for (Object f : figuras) {

            if (f instanceof Circulo) {
                ((Circulo) f).dibujar();
            }

            if (f instanceof Rectangulo) {
                ((Rectangulo) f).dibujar();
            }

            if (f instanceof Triangulo) {
                ((Triangulo) f).dibujar();
            }
        }
    }
}