package casestudy.src.services.impl;

import casestudy.src.models.Employee;
import casestudy.src.services.IEmployeeService;
import casestudy.src.utils.WriteReadFileEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmployeeServiceImpl implements IEmployeeService {
    Scanner sc = new Scanner(System.in);
    String filePath = "src\\data\\employee.csv";

    @Override
    public void addList() {
        List<Employee> employeeList = WriteReadFileEmployee.readFile(filePath);
        boolean check = true;
        try {
            System.out.print("Enter id employee: ");
            String idEmployee = sc.nextLine();
            for (Employee employee : employeeList) {
                if (employee.getIdEmployee().equals(idEmployee)) {
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
                System.out.print("Enter academic level: ");
                String academicLevel = sc.nextLine();
                System.out.print("Enter position: ");
                String position = sc.nextLine();
                employeeList.add(new Employee(name, birthday, gender, idCardNumber, phoneNumber,
                        email, idEmployee, academicLevel, position));
                WriteReadFileEmployee.writeFile(employeeList, filePath, false);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public void displayList() {
        List<Employee> employeeList = WriteReadFileEmployee.readFile(filePath);
        for (Employee employee : employeeList) {
            System.out.print(employee.toString() + "\n");
        }

    }

    @Override
    public void editList() {
        List<Employee> employeeList = WriteReadFileEmployee.readFile(filePath);

        try {
            System.out.print("Enter the employee id you want to edit: ");
            String id = sc.nextLine();

            boolean check = false;
            for (Employee employee : employeeList) {
                if (employee.getIdEmployee().equals(id)) {
                    check = true;
                    System.out.println("What information would you like to edit?");
                    System.out.println("1. Edit name");
                    System.out.println("2. Edit birthday");
                    System.out.println("3. Edit gender");
                    System.out.println("4. Edit id card number");
                    System.out.println("5. Edit phone number");
                    System.out.println("6. Edit email");
                    System.out.println("7. Edit academic level");
                    System.out.println("8. Edit position");
                    System.out.println("9. Return main menu");
                    int choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1:
                            System.out.print("Enter new name: ");
                            String newName = sc.nextLine();
                            employee.setName(newName);
                            WriteReadFileEmployee.writeFile(employeeList, filePath, false);
                            break;
                        case 2:
                            System.out.print("Enter new birthday: ");
                            String newBirthDay = sc.nextLine();
                            employee.setBirthday(newBirthDay);
                            WriteReadFileEmployee.writeFile(employeeList, filePath, false);
                            break;
                        case 3:
                            System.out.print("Enter new gender: ");
                            String newGender = sc.nextLine();
                            employee.setGender(newGender);
                            WriteReadFileEmployee.writeFile(employeeList, filePath, false);
                            break;
                        case 4:
                            System.out.print("Enter new id card number: ");
                            String newIdCardNumber = sc.nextLine();
                            employee.setIdCardNumber(newIdCardNumber);
                            WriteReadFileEmployee.writeFile(employeeList, filePath, false);
                            break;
                        case 5:
                            System.out.print("Enter new phone number: ");
                            String newPhoneNumber = sc.nextLine();
                            employee.setPhoneNumber(newPhoneNumber);
                            WriteReadFileEmployee.writeFile(employeeList, filePath, false);
                            break;
                        case 6:
                            System.out.print("Enter new email: ");
                            String newEmail = sc.nextLine();
                            employee.setEmail(newEmail);
                            WriteReadFileEmployee.writeFile(employeeList, filePath, false);
                            break;
                        case 7:
                            System.out.print("Enter new academic level: ");
                            String newAcademicLevel = sc.nextLine();
                            employee.setAcademicLevel(newAcademicLevel);
                            WriteReadFileEmployee.writeFile(employeeList, filePath, false);
                            break;
                        case 8:
                            System.out.print("Enter new position: ");
                            String newPosition = sc.nextLine();
                            employee.setPosition(newPosition);
                            WriteReadFileEmployee.writeFile(employeeList, filePath, false);
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
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
