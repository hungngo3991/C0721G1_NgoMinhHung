package ss6_ke_thua.thuc_hanh.doi_tuong_hinh_hoc;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("blue",false,2.0);
        System.out.println(circle);
    }


}
