package ss4_class_and_object.bai_tap.phuong_trinh_bac_hai;

import java.util.Scanner;

import static ss4_class_and_object.bai_tap.phuong_trinh_bac_hai.QuadraticEquation.*;

public class Main {
    public static void main(String[] Strings) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = sc.nextDouble();

        double d = getDiscriminant(a, b, c);

        if (d > 0.0) {
            double r1 = getRoot1(a, b, d);
            double r2 = getRoot2(a, b, d);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (d == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        } else {
            System.out.println("The equation has no roots");
        }
    }

}
