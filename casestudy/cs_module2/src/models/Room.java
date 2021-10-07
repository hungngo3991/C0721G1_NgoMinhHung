package casestudy.src.models;

public class Room extends Facility {
    private FreeService freeService;

    public Room() {
    }

    public Room(String idService, String nameService, double usableArea, double rentalCost, int maxPeople,
                String rentalType, FreeService freeService) {
        super(idService, nameService, usableArea, rentalCost, maxPeople, rentalType);
        this.freeService = freeService;
    }

    public FreeService getFreeService() {
        return freeService;
    }

    public void setFreeService(FreeService freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService=" + freeService +
                "} " + super.toString();
    }
}
