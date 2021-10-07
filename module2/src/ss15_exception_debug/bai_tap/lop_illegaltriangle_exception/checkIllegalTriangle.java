package ss15_exception_debug.bai_tap.lop_illegaltriangle_exception;

import java.util.Scanner;

public class checkIllegalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean reEnter = true;
        do {
            System.out.print("Enter three side of the triangle \n");
            System.out.print("Enter side 1: ");
            double side1 = sc.nextDouble();
            System.out.print("Enter side 2: ");
            double side2 = sc.nextDouble();
            System.out.print("Enter side 3: ");
            double side3 = sc.nextDouble();

            try {
                Triangle triangle = new Triangle(side1, side2, side3);
                reEnter = false;
                System.out.println(triangle);

            } catch (IllegalTriangleException e) {
                System.out.println("Illegal Triangle, please re-enter");
            }

        } while (reEnter);
    }
}
