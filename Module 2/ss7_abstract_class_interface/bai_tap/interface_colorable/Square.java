package ss7_abstract_class_interface.bai_tap.interface_colorable;

public class Square extends Rectangle implements Colorable {

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public double getArea() {
        return super.getArea();
    }

    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return "A square with " +
                "side= " + super.getLength() +
                ", which is a subclass of " +
                super.toString();
    }
public void howToColor() {
    System.out.println("Color all four sides..");
}
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        square.howToColor();
    }
}
