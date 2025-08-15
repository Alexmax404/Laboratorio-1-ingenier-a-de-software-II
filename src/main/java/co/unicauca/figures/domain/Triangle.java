package co.unicauca.figures.domain;
/**
 *
 * @author Glenn Alexander Ward
 */
public class Triangle extends Figura {
    public Triangle(double base, double height) {
        super("Trianglulo",base, height);
    }

    @Override
    public double calculateArea() {
        return (x * y) / 2;
    }

    @Override
    public double calculatePerimeter() {

        return x + y + Math.sqrt(x*x + y*y);
    }
}
