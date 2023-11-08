package OOP.bai_tap;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
        this.speed = 1;
        this.on = false;
        this.radius = 5.0;
        this.color = "blue";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        if (on) {
            return "Fan{" +
                    "speed= " + speed +
                    ", radius= " + radius +
                    ", color= '" + color + '\'' +
                    ", fan is on" +
                    '}';
        } else {
            return "Fan{" +
                    "radius= " + radius +
                    ", color= '" + color + '\'' +
                    ", fan is off" +
                    '}';
        }

    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10.0, "yellow");
        Fan fan2 = new Fan(2, false, 5.0, "blue");
        System.out.println("fan1:");
        System.out.println(fan1);
        System.out.println("fan2:");
        System.out.println(fan2);
    }
}
