package ss5_acccess_modifier.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setArea(3.0);
        circle.setRadius(4.0);
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());

    }
}
