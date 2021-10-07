package ss7_abstractclass_interface.bai_tap.resizeable;

public class Square extends Rectangle implements Resizeable {
    private double side;
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double width, double length, double side) {
        super(width, length);
        this.side = side;
    }

    public Square(double width, double length, String color, boolean filled, double side) {
        super(width, length, color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString()
                ;
    }



    @Override
    public void resize(double percent) {
        this.side *= (percent / 200);
    }
}
