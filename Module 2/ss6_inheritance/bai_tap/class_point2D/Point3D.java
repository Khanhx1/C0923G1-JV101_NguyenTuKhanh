package ss6_inheritance.bai_tap;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{super.getX(), super.getY(), this.getZ()};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                " x = " + super.getX() +
                " y =" + super.getY() +
                " z = " + z +
                '}';
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(1, 2, 3);
        System.out.println(point3D);
        point3D.setXYZ(4, 5, 6);
        System.out.println(point3D);
    }
}
