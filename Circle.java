/******************************************************************************
 *  Nafn    : Jóhannes Reykdal Einarsson
 *  T-póstur: jre5@hi.is
 *
 *  Lýsing  : Undirklasinn Circle sem að erfir aðferðir sínar frá Shape
 *
 *
 *****************************************************************************/

public class Circle extends Shape {
    //smiður
    public Circle(double w) {
        setWidth(w);
    }

    /**
     * <p>
     * reiknar flatarmál hrings út frá breidd hans, þ.e. þvermáli
     * </p>
     *
     * @return flatarmál hrings
     */
    public double getArea() {
        double r = getWidth() / 2;
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        Circle c = new Circle(3.0);
        System.out.printf(" %5.2f %n", c.getArea());

    }
}
