import java.util.Scanner;

import static java.lang.Math.sqrt;
import static java.lang.Math.abs;

public class LiCode {

    public static void main(String[] args) {

    }

    public static void solveEquation(int a, int b, int c) {
        if (a == 0) {
            System.out.println("The value of a cannot be 0!");
            return;
        }
        int d = b * b - 4 * a * c;
        double sqrtval = sqrt(abs(d));
        if (d > 0) {
            System.out.println("The equation has two solutions: ");
            System.out.println((-b + sqrtval) / (2 * a) + "\n" + (-b - sqrtval) / (2 * a));
        } else if (d == 0) {
            System.out.println("The equation has a double solution: ");
            System.out.println(-(double) b / (2 * a));
        } else {
            System.out.println("The equation has no solution!");
        }
    }

}
