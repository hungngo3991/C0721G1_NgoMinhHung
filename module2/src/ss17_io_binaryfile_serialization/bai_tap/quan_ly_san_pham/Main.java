package ss17_io_binaryfile_serialization.bai_tap.quan_ly_san_pham;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Add product");
            System.out.println("2. Display product");
            System.out.println("3. Search product");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    ProductManager.add();
                    break;
                case 2:
                    ProductManager.display();
                    break;
                case 3:
                    ProductManager.search();
                    break;
                case 4:
                    System.exit(0);
            }

        } while (true);

    }
}
