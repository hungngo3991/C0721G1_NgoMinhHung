package bai_tap_lam_them;


import java.util.Scanner;

public class StudentManager {
    Scanner sc = new Scanner(System.in);
    public static Student[] studentList = new Student[100];

    static {
        studentList[0] = new Student("001", "Ngo Van A", 42, null);
        studentList[1] = new Student("002", "Nguyen Van B", 34, null);
    }

    private Address address;

    public void add() {
        System.out.println("Input ID");
        String id = sc.nextLine();
        System.out.println("Input name");
        String name = sc.nextLine();
        System.out.println("Input age");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Input houseNumber");
        String houseNumber = sc.nextLine();
        System.out.println("Input street");
        String street = sc.nextLine();
        System.out.println("Input ward");
        String ward = sc.nextLine();
        System.out.println("Input district");
        String district = sc.nextLine();
        System.out.println("Input province");
        String province = sc.nextLine();


        Student student = new Student(id, name, age, new Address(houseNumber, street, ward, district, province));

        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] == null) {
                studentList[i] = student;
                break;
            }
        }
    }

    public void edit() {
        System.out.print("Enter the student id you want to edit: ");
        String id = sc.nextLine();

        for (Student student : studentList) {
            if (student.getId().equals(id)) {
                System.out.println("Edit name");
                String name = sc.nextLine();
                System.out.println("Edit age");
                int age = Integer.parseInt(sc.nextLine());
                student.setName(name);
                student.setAge(age);
                break;

            }
        }
    }

    public void delete() {
        System.out.print("Enter the student id you want to delete: ");
        String id = sc.nextLine();
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i].getId().equals(id)) {
                studentList[i] = null;
                break;
            }
        }
    }

    public void display() {
        for (Student student : studentList) {
            if (student != null) {
                System.out.println(student.toString());
            }
        }
    }

    public void search() {
        System.out.print("Enter the student id you want to search: ");
        String id = sc.nextLine();
        for (Student student : studentList) {
            if (student.getId().equals(id)) {
                System.out.println(student.toString());
                break;
            }
        }
    }
}
