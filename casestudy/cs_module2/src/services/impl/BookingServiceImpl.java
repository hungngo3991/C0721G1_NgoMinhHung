package casestudy.src.services.impl;

import casestudy.src.models.*;
import casestudy.src.services.IBookingService;
import casestudy.src.utils.*;


import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BookingServiceImpl implements IBookingService {
    Scanner sc = new Scanner(System.in);
    String filePathH = "src\\data\\house.csv";
    String filePathR = "src\\data\\room.csv";
    String filePathV = "src\\data\\villa.csv";
    String filePathBooking = "src\\data\\booking.csv";
    String filePath = "src\\data\\customer.csv";


    @Override
    public void bookService() {

    }

    @Override
    public void addList() {
        Set<Booking> bookingList = WriteReadFileBooking.readFile(filePathBooking);
        boolean check = true;
        System.out.print("Enter id booking: ");
        String idBooking = sc.nextLine();
        for (Booking booking : bookingList) {
            if (booking.getIdBooking().equals(idBooking)) {
                System.out.print("The id you just entered is already in the list. Next choice:\n");
                check = false;
                break;
            }
        }
        if (check) {
            System.out.print("Enter start date: ");
            String startDate = sc.nextLine();
            System.out.print("Enter end date: ");
            String endDate = sc.nextLine();
            System.out.println("List of customers: ");
            List<Customer> customerList = WriteReadFileCustomer.readFile(filePath);
            for (Customer customer : customerList) {
                System.out.print(customer.toString() + "\n");
            }
            System.out.print("Enter id customer: ");
            String idCustomer = sc.nextLine();
            System.out.println("List of service: ");
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
            System.out.print("Enter name service: ");
            String nameService = sc.nextLine();
            System.out.print("Enter id service: ");
            String idService = sc.nextLine();


            bookingList.add(new Booking(idBooking, startDate, endDate, idCustomer, nameService, idService));
            WriteReadFileBooking.writeFile(bookingList, filePathBooking, false);


            for (Room room : roomSet) {
                if (room.getIdService().equals(idService)) {
                    roomList.put(room, (roomList.get(room)) + 1);
                    WriteReadFileRoom.writeFile(roomList, filePathR, false);
                    break;
                }
            }

            for (House house : houseSet) {
                if (house.getIdService().equals(idService)) {
                    houseList.put(house, (houseList.get(house)) + 1);
                    WriteReadFileHouse.writeFile(houseList, filePathH, false);
                    break;
                }
            }


            for (Villa villa : villaSet) {
                if (villa.getIdService().equals(idService)) {
                    villaList.put(villa, (villaList.get(villa)) + 1);
                    WriteReadFileVilla.writeFile(villaList, filePathV, false);
                    break;
                }
            }


        }

    }

    @Override
    public void displayList() {
        Set<Booking> bookingList = WriteReadFileBooking.readFile(filePathBooking);
        for (Booking booking : bookingList) {
            System.out.println(booking.toString() + "\n");
        }
    }

    @Override
    public void editList() {

    }
}
