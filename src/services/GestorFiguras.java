package services;

import model.Figura;

import java.util.ArrayList;

//En esta clase realizaremos los dsitntos bucles para cada figura
public class GestorFiguras {

    public ArrayList<Figura> figuras;

    public GestorFiguras() {
        figuras = new ArrayList<>();
    }

    //Aquí podremos agregar las nuevas figuras
    public void agregarFigura(Figura f) {
        figuras.add(f);
    }

    public void mostrarAreas() {
//Esto es un bucle donde para cada figura mostraremos su área
        for (Figura f : figuras) {

            //System.out.println(f.calcularArea);
        }
    }

    public void mostrarPerimetros() {
//Esto es un bucle donde para cada figura mostraremos su perímetro
        for (Figura f : figuras) {

            //System.out.println(f.calcularPerimetro);
        }
    }

    public void dibujarTodo() {
//Esto es un bucle donde para cada figura la dibujaremos en pantalla
        for (Figura f : figuras) {

            //System.out.println(f.dibujar);
        }
    }
}