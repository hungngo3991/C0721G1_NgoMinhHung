package ss5_acccess_modifier.thuc_hanh.static_property;

public class TestStaticProperty {
    public static void main(String[] args) {

        Car car1 = new Car("Mazda 3", "V2");

        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mazda 6", "I4");

        System.out.println(Car.numberOfCars);

    }
}
