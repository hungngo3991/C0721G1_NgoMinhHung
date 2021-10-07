package ss10_dsa_list.bai_tap.linkedlist;

public class MyLinkedListTest {

    public static class Car {
        private String id;
        private String name;
        private String color;

        public Car() {
        }

        public Car(String id, String name, String color) {
            this.id = id;
            this.name = name;
            this.color = color;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }

    public static void main(String[] args) {
        MyLinkedList<Car> cars = new MyLinkedList<>();
        Car car1 = new Car("001", "Tesla", "black");
        Car car2 = new Car("002", "BMW", "white");
        Car car3 = new Car("003", "Audi", "red");
        Car car4 = new Car("004", "Ford", "blue");
        Car car5 = new Car("005", "Toyota", "black");
        Car car6 = new Car("006", "Toyota", "green");
        cars.addFirst(car1);
        cars.addFirst(car2);
        cars.addFirst(car3);
        cars.addFirst(car4);
        cars.addFirst(car5);
        cars.addLast(car6);
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            System.out.println(car.getName());
        }
    }
}
