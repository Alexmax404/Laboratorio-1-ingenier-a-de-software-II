package co.unicauca.figures;

import co.unicauca.figures.domain.Circle;
import co.unicauca.figures.domain.Triangle;
import co.unicauca.figures.domain.Square;
import co.unicauca.figures.domain.Figura;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Glenn Alexander Ward
 */
public class Main {

    public static void main(String[] args) {
        Figura fig1 = new Circle(2.2); //radio
        Figura fig2 = new Square(7.3); //lado
        Figura fig3 = new Triangle(4.0, 3.5); //base y altura

        List<Figura> figuras = new ArrayList<>() ;
        figuras.add(fig1);
        figuras.add(fig2);
        figuras.add(fig3);

        for(Figura fig: figuras){
            System.out.println(fig.getName());
            System.out.println("Area: " + fig.calculateArea());
            System.out.println("Perimetro: " + fig.calculatePerimeter());

            System.out.println("---------------------------------------------------");
        }
    }
}
