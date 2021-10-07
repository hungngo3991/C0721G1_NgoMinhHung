package ss6_ke_thua.bai_tap.circle_cylinder;

public class Main {
    public static void main(String[] args) {


        Circle circle = new Circle();
        circle.setColor("red");
        circle.setRadius(4.0);


        System.out.println(circle);
        System.out.println(circle.getArea());


        Cylinder cylinder1 = new Cylinder();

        Cylinder cylinder2 = new Cylinder(2.0);

        Cylinder cylinder3 = new Cylinder(3.0, "blue", 2.0);

        System.out.println(cylinder1);
        System.out.println(cylinder2);
        System.out.println(cylinder3);
        System.out.println(cylinder3.getVolume());



    }
}
