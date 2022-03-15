package clases;

import clases.Figura;

public class Circulo extends Figura{
    
    final double pi=3.1416;
    private double radio;

    public double CalcularArea() {        
        return this.area=pi*radio*radio;
     }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
