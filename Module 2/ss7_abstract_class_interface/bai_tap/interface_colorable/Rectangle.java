package ss7_abstract_class_interface.bai_tap.interface_colorable;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width= "
                + getWidth()
                + " and length= "
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,4);
        System.out.println(rectangle);
    }
}
