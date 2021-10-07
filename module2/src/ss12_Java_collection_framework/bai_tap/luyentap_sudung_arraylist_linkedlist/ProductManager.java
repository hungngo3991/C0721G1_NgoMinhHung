package ss12_Java_collection_framework.bai_tap.luyentap_sudung_arraylist_linkedlist;


import java.util.*;

public class ProductManager {
    Scanner sc = new Scanner(System.in);
    public static List<Product> productList = new LinkedList<>();

    static {
        Product product1 = new Product("001", "Samsung 8", "Samsung", 500000);
        Product product2 = new Product("002", "Samsung Note", "Samsung", 1000000);

        productList.add(product1);
        productList.add(product2);
    }

    public void add() {
        System.out.println("Input ID");
        String id = sc.nextLine();
        System.out.println("Input nameproduct");
        String nameproduct = sc.nextLine();
        System.out.println("Input manufacturer");
        String manufacturer = sc.nextLine();
        System.out.println("Input price");
        int price = Integer.parseInt(sc.nextLine());

        Product product = new Product(id, nameproduct, manufacturer, price);
        productList.add(product);

    }

    public void edit() {
        System.out.print("Enter the product id you want to edit: ");
        String id = sc.nextLine();

        for (Product product : productList) {
            if (product.getId().equals(id)) {
                System.out.println("Edit nameproduct");
                String nameproduct = sc.nextLine();
                System.out.println("Edit manufacturer");
                String manufacturer = sc.nextLine();
                System.out.println("Input price");
                int price = Integer.parseInt(sc.nextLine());
                product.setNameProduct(nameproduct);
                product.setManufacturer(manufacturer);
                product.setPrice(price);
                break;
            }
        }
    }

    public void delete() {
        System.out.print("Enter the product id you want to delete: ");
        String id = sc.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(id)) {
                productList.remove(i);
                break;
            }
        }
    }

    public void display() {
        Collections.sort(productList);
        for (Product product : productList) {
            if (product != null) {
                System.out.println(product);
            }
        }
    }

    public void search() {
        System.out.print("Enter the product id you want to search: ");
        String id = sc.nextLine();
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                System.out.println(product);
                break;
            }
        }
    }
}
