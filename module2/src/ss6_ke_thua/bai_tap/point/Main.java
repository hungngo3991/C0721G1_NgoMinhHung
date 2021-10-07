package ss6_ke_thua.bai_tap.point;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point2d = new Point2D();

        point2d.setXY(10000000,5000000);


        System.out.println(Arrays.toString(point2d.getXY()));

        Point3D point3d = new Point3D();

        point3d.setXYZ(500,300,200);

        System.out.println(Arrays.toString(point3d.getXYZ()));

        System.out.println(point3d);
    }



}
