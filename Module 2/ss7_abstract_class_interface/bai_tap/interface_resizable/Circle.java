package ss7_abstract_class_interface.bai_tap.interface_resizable;

public class Circle extends Shape implements Resizable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public void resize(double percent) {
        this.radius = this.radius * (1 + (percent / 100));
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius= "
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.resize(50);
        System.out.println(circle);
    }
}
