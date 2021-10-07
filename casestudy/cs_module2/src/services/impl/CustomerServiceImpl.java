package casestudy.src.services.impl;

import casestudy.src.models.AddressCustomer;
import casestudy.src.models.Customer;
import casestudy.src.services.ICustomerService;
import casestudy.src.utils.WriteReadFileCustomer;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    Scanner sc = new Scanner(System.in);
    String filePath = "src\\data\\customer.csv";

    @Override
    public void addList() {
        List<Customer> customerList = WriteReadFileCustomer.readFile(filePath);
        boolean check = true;
        System.out.print("Enter id customer: ");
        String idCustomer = sc.nextLine();
        for (Customer customer : customerList) {
            if (customer.getIdCustomer().equals(idCustomer)) {
                System.out.print("The id you just entered is already in the list. Next choice:\n");
                check = false;
                break;
            }
        }
        if (check) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter birthday: ");
            String birthday = sc.nextLine();
            System.out.print("Enter gender: ");
            String gender = sc.nextLine();
            System.out.print("Enter id card number: ");
            String idCardNumber = sc.nextLine();
            System.out.print("Enter phone number: ");
            String phoneNumber = sc.nextLine();
            System.out.print("Enter email: ");
            String email = sc.nextLine();
            System.out.print("Enter customer type: ");
            String customerType = sc.nextLine();
            System.out.print("Enter house number: ");
            String houseNumber = sc.nextLine();
            System.out.print("Enter street: ");
            String street = sc.nextLine();
            System.out.print("Enter ward: ");
            String ward = sc.nextLine();
            System.out.print("Enter district: ");
            String district = sc.nextLine();
            System.out.print("Enter province: ");
            String province = sc.nextLine();
            AddressCustomer addressCustomer = new AddressCustomer(houseNumber, street,
                    ward, district, province);
            customerList.add(new Customer(name, birthday, gender, idCardNumber, phoneNumber,
                    email, idCustomer, customerType, addressCustomer));
            WriteReadFileCustomer.writeFile(customerList, filePath, false);
        }

    }

    @Override
    public void displayList() {
        List<Customer> customerList = WriteReadFileCustomer.readFile(filePath);
        for (Customer customer : customerList) {
            System.out.print(customer.toString() + "\n");
        }
    }

    @Override
    public void editList() {
        List<Customer> customerList = WriteReadFileCustomer.readFile(filePath);
        System.out.print("Enter the customer id you want to edit: ");
        String id = sc.nextLine();

        boolean check = false;
        for (Customer customer : customerList) {
            if (customer.getIdCustomer().equals(id)) {
                check = true;
                System.out.println("What information would you like to edit?");
                System.out.println("1. Edit name");
                System.out.println("2. Edit birthday");
                System.out.println("3. Edit gender");
                System.out.println("4. Edit id card number");
                System.out.println("5. Edit phone number");
                System.out.println("6. Edit email");
                System.out.println("7. Edit customer type");
                System.out.println("8. Edit customer address");
                System.out.println("9. Return main menu");
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        System.out.print("Enter new name: ");
                        String newName = sc.nextLine();
                        customer.setName(newName);
                        WriteReadFileCustomer.writeFile(customerList, filePath, false);
                        break;
                    case 2:
                        System.out.print("Enter new birthday: ");
                        String newBirthDay = sc.nextLine();
                        customer.setBirthday(newBirthDay);
                        WriteReadFileCustomer.writeFile(customerList, filePath, false);
                        break;
                    case 3:
                        System.out.print("Enter new gender: ");
                        String newGender = sc.nextLine();
                        customer.setGender(newGender);
                        WriteReadFileCustomer.writeFile(customerList, filePath, false);
                        break;
                    case 4:
                        System.out.print("Enter new id card number: ");
                        String newIdCardNumber = sc.nextLine();
                        customer.setIdCardNumber(newIdCardNumber);
                        WriteReadFileCustomer.writeFile(customerList, filePath, false);
                        break;
                    case 5:
                        System.out.print("Enter new phone number: ");
                        String newPhoneNumber = sc.nextLine();
                        customer.setPhoneNumber(newPhoneNumber);
                        WriteReadFileCustomer.writeFile(customerList, filePath, false);
                        break;
                    case 6:
                        System.out.print("Enter new email: ");
                        String newEmail = sc.nextLine();
                        customer.setEmail(newEmail);
                        WriteReadFileCustomer.writeFile(customerList, filePath, false);
                        break;
                    case 7:
                        System.out.print("Enter new customer type: ");
                        String newCustomerType = sc.nextLine();
                        customer.setCustomerType(newCustomerType);
                        WriteReadFileCustomer.writeFile(customerList, filePath, false);
                        break;
                    case 8:
                        System.out.println("1. Edit house number");
                        System.out.println("2. Edit street");
                        System.out.println("3. Edit ward");
                        System.out.println("4. Edit district");
                        System.out.println("5. Edit province");
                        System.out.println("6. Return");
                        int editAddress = Integer.parseInt(sc.nextLine());
                        switch (editAddress) {
                            case 1:
                                System.out.print("Enter new house number: ");
                                String newHouseNumber = sc.nextLine();
                                AddressCustomer houseNumber = customer.getAddressCustomer();
                                houseNumber.setHouseNumber(newHouseNumber);
                                customer.setAddressCustomer(houseNumber);
                                WriteReadFileCustomer.writeFile(customerList, filePath, false);
                                break;
                            case 2:
                                System.out.print("Enter new street: ");
                                String newStreet = sc.nextLine();
                                AddressCustomer street = customer.getAddressCustomer();
                                street.setStreet(newStreet);
                                customer.setAddressCustomer(street);
                                WriteReadFileCustomer.writeFile(customerList, filePath, false);
                                break;
                            case 3:
                                System.out.print("Enter new ward: ");
                                String newWard = sc.nextLine();
                                AddressCustomer ward = customer.getAddressCustomer();
                                ward.setWard(newWard);
                                customer.setAddressCustomer(ward);
                                WriteReadFileCustomer.writeFile(customerList, filePath, false);
                                break;
                            case 4:
                                System.out.print("Enter new district: ");
                                String newDistrict = sc.nextLine();
                                AddressCustomer district = customer.getAddressCustomer();
                                district.setDistrict(newDistrict);
                                customer.setAddressCustomer(district);
                                WriteReadFileCustomer.writeFile(customerList, filePath, false);
                                break;
                            case 5:
                                System.out.print("Enter new province: ");
                                String newProvince = sc.nextLine();
                                AddressCustomer province = customer.getAddressCustomer();
                                province.setProvince(newProvince);
                                customer.setAddressCustomer(province);
                                WriteReadFileCustomer.writeFile(customerList, filePath, false);
                                break;
                            case 6:
                                break;
                            default:
                                System.out.print("You have entered the wrong number, please re-enter.");
                        }
                        break;
                    case 9:
                        break;
                    default:
                        System.out.println("You have entered the wrong number, please re-enter.");
                }
            }
        }
        if (!check) {
            System.out.println("The id you just entered is not in the list. Next choice: ");
        }
    }
}
