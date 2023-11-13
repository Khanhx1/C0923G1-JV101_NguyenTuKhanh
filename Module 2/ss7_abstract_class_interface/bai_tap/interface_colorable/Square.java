package ss7_abstract_class_interface.bai_tap.interface_colorable;

public class Square extends Rectangle implements Colorable {
    private double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
        this.side = side;
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
                "side= " + this.side +
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
