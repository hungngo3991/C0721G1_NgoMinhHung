package ss4_class_and_object.bai_tap.phuong_trinh_bac_hai;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public static double getDiscriminant(double a, double b, double c) {
        return b * b - 4.0 * a * c;
    }

    public static double getRoot1(double a, double b, double d) {
        return (-b + Math.pow(d, 0.5)) / (2.0 * a);
    }

    public static double getRoot2(double a, double b, double d) {
        return (-b - Math.pow(d, 0.5)) / (2.0 * a);
    }


}
