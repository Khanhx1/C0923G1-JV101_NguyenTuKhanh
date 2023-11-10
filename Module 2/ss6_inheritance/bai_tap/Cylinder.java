package ss6_inheritance.bai_tap;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius = " + super.getRadius() +
                ", color = " + super.getColor() +
                ", height =" + height +
                ", volume= " + this.getVolume() +
                '}';
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(6, "red", 7);
        System.out.println(cylinder);
    }
}
