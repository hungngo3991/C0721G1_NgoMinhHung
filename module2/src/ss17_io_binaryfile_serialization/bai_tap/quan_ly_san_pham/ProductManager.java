package ss17_io_binaryfile_serialization.bai_tap.quan_ly_san_pham;

import java.util.List;
import java.util.Scanner;

public class ProductManager {
    static Scanner sc = new Scanner(System.in);
    static String filePath = "src\\ss17_io_binaryfile_serialization\\bai_tap\\quan_ly_san_pham\\phone.csv";

    public static void add() {
        List<Product> productList = WriteReadFile.readFile(filePath);
        boolean check = true;
        System.out.print("Enter id: ");
        String id = sc.nextLine();
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                System.out.print("The id you just entered is already in the list. Next choice:\n");
                check = false;
                break;
            }
        }
        if (check) {
            productList.clear();
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter manufacturer: ");
            String manufacturer = sc.nextLine();
            System.out.print("Enter price: ");
            double price = Double.parseDouble(sc.nextLine());
            System.out.print("Enter other descriptions: ");
            String description = sc.nextLine();
            productList.add(new Product(id, name, manufacturer, price, description));

            WriteReadFile.writeFile(productList, filePath, true);
        }
    }

    public static void display() {
        List<Product> productList = WriteReadFile.readFile(filePath);
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }

    public static void search() {
        List<Product> productList = WriteReadFile.readFile(filePath);
        System.out.print("Enter the product id you want to search: ");
        String id = sc.nextLine();
        boolean check = false;
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                System.out.println(product);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("The id you just entered is not in the list. Next choice:");
        }
    }


}
