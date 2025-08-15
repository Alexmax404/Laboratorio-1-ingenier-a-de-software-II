package co.unicauca.figures.domain;

/**
 *
 * @author Glenn Alexander Ward
 */
public abstract class Figura {
    protected String name;
    protected double x;
    protected double y;

    public Figura(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public String getName() {
        return name;
    }
    public void setName(String name) {}
}
