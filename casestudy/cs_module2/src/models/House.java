package casestudy.src.models;

public class House extends Facility {
    private String roomStandard;
    private int numberFloor;

    public House() {
    }

    public House(String idService, String nameService, double usableArea, double rentalCost, int maxPeople,
                 String rentalType, String roomStandard, int numberFloor) {
        super(idService, nameService, usableArea, rentalCost, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberFloor = numberFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", numberFloor=" + numberFloor +
                "} " + super.toString();
    }
}
