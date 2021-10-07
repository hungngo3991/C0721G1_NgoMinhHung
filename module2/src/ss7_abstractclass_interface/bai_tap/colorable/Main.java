package ss7_abstractclass_interface.bai_tap.colorable;

public class Main {


    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println(shape + "\nArea: " + ((Circle) shape).getArea());
            }
            if (shape instanceof Rectangle) {
                System.out.println(shape + "\nArea: " + ((Rectangle) shape).getArea());
            }
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
            System.out.println();
        }
    }
}
