package ss5_access_modifier_stastic_method.bai_tap;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }

    public String getColor() {
        return color;
    }
}

