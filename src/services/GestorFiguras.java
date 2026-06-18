package services;

import model.Figura;

import java.util.ArrayList;

public class GestorFiguras {

    public ArrayList<Figura> figuras;

    public GestorFiguras() {
        figuras = new ArrayList<>();
    }

    public void agregarFigura(Figura f) {
        figuras.add(f);
    }

    public void mostrarAreas() {

        for (Figura f : figuras) {

            //System.out.println(f.calcularArea);
        }
    }

    public void mostrarPerimetros() {

        for (Figura f : figuras) {

            //System.out.println(f.calcularPerimetro);
        }
    }

    public void dibujarTodo() {

        for (Figura f : figuras) {

            //System.out.println(f.dibujar);
        }
    }
}