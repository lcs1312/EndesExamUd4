package model;

//En esta clase realizaremos las distintas operaciones acerca del círculo
public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return 3.1416 * radio * radio;
        //Aqui se calcula el area del circulo
    }

    public double calcularPerimetro() {
        return 2 * 3.1416 * radio;
        //Aqui se calcula el perimetro del circulo
    }

    public void dibujar() {
        System.out.println("Dibujando circulo de radio " + radio);
        //Aqui se dibuja el circulo
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public void saludar() {
        System.out.println("Un saludo de parte del círculo");
        //Aquí mandamos un saludo de parte del círculo
    }
}