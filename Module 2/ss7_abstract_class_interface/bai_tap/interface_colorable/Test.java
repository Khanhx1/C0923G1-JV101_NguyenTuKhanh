package ss7_abstract_class_interface.bai_tap.interface_colorable;


public class Test {
    public static void main(String[] args) {
        Shape[] arr = new Shape[5];
        arr[0] = new Circle(1);
        arr[1] = new Square(7);
        arr[2] = new Rectangle(2, 4);
        arr[3] = new Square(5);
        arr[4] = new Circle(5);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] instanceof Square) {
                Square square = (Square) arr[i];
                square.howToColor();
            }else if(arr[i] instanceof Circle) {
                Circle circle = (Circle) arr[i];
                System.out.println(circle.getArea());
            } else {
                Rectangle rectangle = (Rectangle) arr[i];
                System.out.println(rectangle.getArea());
            }
        }
    }
}
