package ss6_ke_thua.bai_tap.circle_cylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return height * getRadius() * getRadius() * Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "height=" + height + "}" + " , which is a subclass of " + super.toString();
    }
}
