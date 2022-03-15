package clases;

public class Rectangulo extends Figura{
    
    private double base;
    private double altura;

    public double CalcularArea() {        
        return this.area=(base*altura);
     }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
