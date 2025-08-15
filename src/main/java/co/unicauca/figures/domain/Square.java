package co.unicauca.figures.domain;
/**
 *
 * @author Glenn Alexander Ward
 */
public class Square extends Figura {
    public Square(double side) {
        super("Cuadrado",side, 0);
    }

    @Override
    public double calculateArea() {
        return x * x;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * x;
    }
}