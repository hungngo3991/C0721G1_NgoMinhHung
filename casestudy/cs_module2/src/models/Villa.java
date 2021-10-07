package casestudy.src.models;



public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int numberFloor;

    public Villa() {
    }

    public Villa(String idService, String nameService, double usableArea, double rentalCost,
                 int maxPeople, String rentalType, String roomStandard, double poolArea, int numberFloor) {
        super(idService, nameService, usableArea, rentalCost, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberFloor = numberFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberFloor=" + numberFloor +
                "} " + super.toString();
    }
}
