package casestudy.src.controllers;

import casestudy.src.services.impl.BookingServiceImpl;
import casestudy.src.services.impl.CustomerServiceImpl;
import casestudy.src.services.impl.EmployeeServiceImpl;
import casestudy.src.services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {

    public static void main(String[] args) {
        displayMainMenu();
    }

    private static void displayMainMenu() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        BookingServiceImpl bookingService = new BookingServiceImpl();
        Scanner sc = new Scanner(System.in);
        int choice;
        try {
            do {
                System.out.print("MainMenu:\n" + "1. Employee Management\n" + "2. Customer Management\n" + "3. Facility Management\n"
                        + "4. Booking Management\n" + "5. Promotion Management\n" + "6. Exit\n" + "Your choice:");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        int choice1;
                        do {
                            System.out.print("1. Display list employees\n" + "2. Add new employee\n" + "3. Edit employee\n"
                                    + "4. Return main menu\n" + "Your choice:");
                            choice1 = Integer.parseInt(sc.nextLine());
                            switch (choice1) {
                                case 1:
                                    employeeService.displayList();
                                    break;
                                case 2:
                                    employeeService.addList();
                                    break;
                                case 3:
                                    employeeService.editList();
                                    break;
                                case 4:
                                    break;
                                default:
                                    System.out.println("You have entered the wrong number, please re-enter.");
                            }
                        } while (choice1 != 4);
                        break;
                    case 2:
                        int choice2;
                        do {
                            System.out.print("1. Display list customers\n" + "2. Add new customer\n" + "3. Edit customer\n"
                                    + "4. Return main menu\n" + "Your choice:");
                            choice2 = Integer.parseInt(sc.nextLine());
                            switch (choice2) {
                                case 1:
                                    customerService.displayList();
                                    break;
                                case 2:
                                    customerService.addList();
                                    break;
                                case 3:
                                    customerService.editList();
                                    break;
                                case 4:
                                    break;
                                default:
                                    System.out.println("You have entered the wrong number, please re-enter.");
                            }
                        } while (choice2 != 4);
                        break;
                    case 3:
                        int choice3;
                        do {
                            System.out.print("1. Display list facility\n" + "2. Add new facility\n" + "3. Display list facility maintenance\n"
                                    + "4. Return main menu\n" + "Your choice:");
                            choice3 = Integer.parseInt(sc.nextLine());
                            switch (choice3) {
                                case 1:
                                    facilityService.displayList();
                                    break;
                                case 2:
                                    facilityService.addList();
                                    break;
                                case 3:
                                    facilityService.displayMaintenance();
                                    break;
                                case 4:
                                    break;
                                default:
                                    System.out.println("You have entered the wrong number, please re-enter.");
                            }

                        } while (choice3 != 4);
                        break;
                    case 4:
                        int choice4;
                        do {
                            System.out.print("1. Add new booking\n" + "2. Display list booking\n" + "3. Create new contracts\n"
                                    + "4. Display list contracts\n" + "5. Edit contracts\n" + "6. Return main menu\n" + "Your choice:");
                            choice4 = Integer.parseInt(sc.nextLine());
                            switch (choice4) {
                                case 1:
                                    bookingService.addList();
                                    break;
                                case 2:
                                    bookingService.displayList();
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    break;
                                case 6:
                                    break;
                            }

                        } while (choice4 != 6);
                        break;
                    case 5:
                        int choice5;
                        do {
                            System.out.print("1. Display list customers use service\n" + "2. Display list customers get voucher\n"
                                    + "3. Return main menu\n" + "Your choice:");
                            choice5 = Integer.parseInt(sc.nextLine());
                            switch (choice5) {
                                case 1:
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;

                            }

                        } while (choice5 != 3);
                        break;
                    case 6:
                        System.exit(0);

                }
            } while (true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
