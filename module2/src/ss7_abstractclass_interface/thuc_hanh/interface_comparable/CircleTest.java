package ss7_abstractclass_interface.thuc_hanh.interface_comparable;

import ss6_ke_thua.thuc_hanh.doi_tuong_hinh_hoc.Circle;

public class CircleTest {
    public static void main(String[] args) {
        ss6_ke_thua.thuc_hanh.doi_tuong_hinh_hoc.Circle circle = new ss6_ke_thua.thuc_hanh.doi_tuong_hinh_hoc.Circle();
        System.out.println(circle);

        circle = new ss6_ke_thua.thuc_hanh.doi_tuong_hinh_hoc.Circle(3.5);
        System.out.println(circle);

        circle = new Circle("blue",false,2.0);
        System.out.println(circle);
    }


}
