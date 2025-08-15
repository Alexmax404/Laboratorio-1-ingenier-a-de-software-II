package co.unicauca.figures.domain;

/**
 *
 * @author Glenn Alexander Ward
 */
public class Circle extends Figura {
    private double radio;



    public Circle(double radio) {

        super("Circulo",0,0);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }




    @Override
    public double calculateArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radio;
    }
    
            
}
