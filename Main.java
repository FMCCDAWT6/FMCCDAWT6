import clases.Circulo;
import clases.Figura;
import clases.Rectangulo;
import clases.Triangulo;
/*
*@author Fernando Marcelo Canuelo Chamorro
*@version 1.0
*@since 2022-03-15
*/
public class Main {

    public static void main(String[] args) {
        
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();
        
        circulo.setRadio(44.55);
        rectangulo.setBase(30);
        rectangulo.setAltura(40);
        triangulo.setBase(50);
        triangulo.setAltura(60);
        
        System.out.println("Area del circulo "+calcularArea(circulo));
        System.out.println("Area del rectangulo "+calcularArea(rectangulo));
        System.out.println("Area del Triangulo "+calcularArea(triangulo));
       }
    
    public static double calcularArea(Figura f){ // Ejemplo de uso de polimorfismo
        
        return f.CalcularArea();
    }
}
