package ss7_abstract_class_interface.bai_tap.interface_resizable;

public class Rectangle extends Shape implements Resizable{
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
    public void resize(double percent) {
        this.width = this.width * (1 + (percent / 100));
        this.length = this.length * (1 + (percent / 100));
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
        rectangle.resize(200);
        System.out.println(rectangle);
    }
}
