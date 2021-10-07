package casestudy.src.services.impl;

import casestudy.src.models.*;
import casestudy.src.services.IFacilityService;
import casestudy.src.utils.WriteReadFileHouse;
import casestudy.src.utils.WriteReadFileRoom;
import casestudy.src.utils.WriteReadFileVilla;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl implements IFacilityService {
    Scanner sc = new Scanner(System.in);
    String filePathH = "src\\data\\house.csv";
    String filePathR = "src\\data\\room.csv";
    String filePathV = "src\\data\\villa.csv";

    @Override
    public void addList() {

        System.out.println("1. Add new room");
        System.out.println("2. Add new house");
        System.out.println("3. Add new villa");
        System.out.println("4. Back to menu");
        System.out.print("Your choice: ");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                Map<Room, Integer> roomList = WriteReadFileRoom.readFile(filePathR);
                Set<Room> roomSet = roomList.keySet();
                boolean checkIdRoom = true;
                System.out.print("Enter id service: ");
                String idRoom = sc.nextLine();
                for (Room room : roomSet) {
                    if (room.getIdService().equals(idRoom)) {
                        System.out.print("The id service you just entered is already in the list. Next choice:\n");
                        checkIdRoom = false;
                        break;
                    }
                }
                if (checkIdRoom) {
                    System.out.print("Enter name service: ");
                    String nameRoom = sc.nextLine();
                    System.out.print("Enter usable area: ");
                    double usableAreaRoom = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter rental cost: ");
                    double rentalCostRoom = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter max people: ");
                    int maxPeopleRoom = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter rental type: ");
                    String rentalTypeRoom = sc.nextLine();
                    System.out.print("Enter free service\n");
                    System.out.print("Enter id free service: ");
                    String idFreeService = sc.nextLine();
                    System.out.print("Enter name free service: ");
                    String nameFreeService = sc.nextLine();
                    int nouRoom = 0;
                    roomList.put(new Room(idRoom, nameRoom, usableAreaRoom, rentalCostRoom, maxPeopleRoom,
                            rentalTypeRoom, new FreeService(idFreeService, nameFreeService)), nouRoom);
                    WriteReadFileRoom.writeFile(roomList, filePathR, false);
                }
                break;
            case 2:
                Map<House, Integer> houseList = WriteReadFileHouse.readFile(filePathH);
                Set<House> houseSet = houseList.keySet();
                boolean checkIdHouse = true;
                System.out.print("Enter id service: ");
                String idHouse = sc.nextLine();
                for (House house : houseSet) {
                    if (house.getIdService().equals(idHouse)) {
                        System.out.print("The id service you just entered is already in the list. Next choice:\n");
                        checkIdHouse = false;
                        break;
                    }
                }
                if (checkIdHouse) {
                    System.out.print("Enter name service: ");
                    String nameHouse = sc.nextLine();
                    System.out.print("Enter usable area: ");
                    double usableAreaHouse = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter rental cost: ");
                    double rentalCostHouse = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter max people: ");
                    int maxPeopleHouse = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter rental type: ");
                    String rentalTypeHouse = sc.nextLine();
                    System.out.print("Enter room standard: ");
                    String roomStandardHouse = sc.nextLine();
                    System.out.print("Enter number floor: ");
                    int numberFloorHouse = Integer.parseInt(sc.nextLine());
                    int nouHouse = 0;
                    houseList.put(new House(idHouse, nameHouse, usableAreaHouse, rentalCostHouse, maxPeopleHouse,
                            rentalTypeHouse, roomStandardHouse, numberFloorHouse), nouHouse);
                    WriteReadFileHouse.writeFile(houseList, filePathH, false);
                }
                break;
            case 3:
                Map<Villa, Integer> villaList = WriteReadFileVilla.readFile(filePathV);
                Set<Villa> villaSet = villaList.keySet();
                boolean checkIdVilla = true;
                System.out.print("Enter id service: ");
                String idVilla = sc.nextLine();
                for (Villa villa : villaSet) {
                    if (villa.getIdService().equals(idVilla)) {
                        System.out.print("The id service you just entered is already in the list. Next choice:\n");
                        checkIdVilla = false;
                        break;
                    }
                }
                if (checkIdVilla) {
                    System.out.print("Enter name service: ");
                    String nameVilla = sc.nextLine();
                    System.out.print("Enter usable area: ");
                    double usableAreaVilla = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter rental cost: ");
                    double rentalCostVilla = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter max people: ");
                    int maxPeopleVilla = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter rental type: ");
                    String rentalTypeVilla = sc.nextLine();
                    System.out.print("Enter room standard: ");
                    String roomStandardVilla = sc.nextLine();
                    System.out.print("Enter pool area: ");
                    double poolAreaVilla = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter number floor: ");
                    int numberFloorVilla = Integer.parseInt(sc.nextLine());
                    int nouVilla = 0;
                    villaList.put(new Villa(idVilla, nameVilla, usableAreaVilla, rentalCostVilla, maxPeopleVilla,
                            rentalTypeVilla, roomStandardVilla, poolAreaVilla, numberFloorVilla), nouVilla);
                    WriteReadFileVilla.writeFile(villaList, filePathV, false);

                }
                break;
            case 4:
                break;
            default:
                System.out.println("You have entered the wrong number, please re-enter.");
        }

    }

    @Override
    public void displayList() {
        Map<Room, Integer> roomList = WriteReadFileRoom.readFile(filePathR);
        Map<House, Integer> houseList = WriteReadFileHouse.readFile(filePathH);
        Map<Villa, Integer> villaList = WriteReadFileVilla.readFile(filePathV);
        Set<Room> roomSet = roomList.keySet();
        Set<House> houseSet = houseList.keySet();
        Set<Villa> villaSet = villaList.keySet();

        for (Room room : roomSet) {
            System.out.println(room + ", Amount used = " + roomList.get(room));
        }
        for (House house : houseSet) {
            System.out.println(house + ", Amount used = " + houseList.get(house));
        }
        for (Villa villa : villaSet) {
            System.out.println(villa + ", Amount used = " + villaList.get(villa));
        }

    }

    @Override
    public void editList() {

    }


    public void displayMaintenance() {

        Map<Room, Integer> roomList = WriteReadFileRoom.readFile(filePathR);
        Set<Room> roomSet = roomList.keySet();
        Map<Room, Integer> roomMaintenance = new LinkedHashMap<>();
        for (Room room : roomSet) {
            if (roomList.get(room) > 5) {
                roomMaintenance.put(room, roomList.get(room));
            }
        }

        Map<House, Integer> houseList = WriteReadFileHouse.readFile(filePathH);
        Set<House> houseSet = houseList.keySet();
        Map<House, Integer> houseMaintenance = new LinkedHashMap<>();
        for (House house : houseSet) {
            if (houseList.get(house) > 5) {
                houseMaintenance.put(house, houseList.get(house));
            }
        }

        Map<Villa, Integer> villaList = WriteReadFileVilla.readFile(filePathV);
        Set<Villa> villaSet = villaList.keySet();
        Map<Villa, Integer> villaMaintenance = new LinkedHashMap<>();
        for (Villa villa : villaSet) {
            if (villaList.get(villa) > 5) {
                villaMaintenance.put(villa, villaList.get(villa));
            }
        }

        Set<Room> roomSetMaintenance = roomMaintenance.keySet();
        Set<House> houseSetMaintenance = houseMaintenance.keySet();
        Set<Villa> villaSetMaintenance = villaMaintenance.keySet();

        for (Room rm : roomSetMaintenance) {
            System.out.println(rm + ", Amount used = " + roomMaintenance.get(rm));
        }

        for (House hm : houseSetMaintenance) {
            System.out.println(hm + ", Amount used = " + houseMaintenance.get(hm));
        }

        for (Villa vm : villaSetMaintenance) {
            System.out.println(vm + ", Amount used = " + villaMaintenance.get(vm));
        }


    }


}
