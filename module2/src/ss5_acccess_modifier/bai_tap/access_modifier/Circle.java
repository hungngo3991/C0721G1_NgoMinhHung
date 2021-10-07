package ss5_acccess_modifier.bai_tap.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private double area = 2.0;

    public Circle() {
    }

    public Circle(double radius, double area) {
        this.radius = radius;
        this.area = area;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
