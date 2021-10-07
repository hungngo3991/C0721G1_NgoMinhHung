package ss12_Java_collection_framework.bai_tap.luyentap_sudung_arraylist_linkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("1. Add\n" + "2. Display\n" + "3. Edit\n" + "4. Delete\n" + "5. Search\n" + "6. Exit\n" + "Your choice:");
            ProductManager productManager = new ProductManager();

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    productManager.add();
                    break;
                case 2:
                    productManager.display();
                    break;
                case 3:
                    productManager.edit();
                    break;
                case 4:
                    productManager.delete();
                    break;
                case 5:
                    productManager.search();
                    break;
                case 6:
                    System.exit(0);
            }
        }

    }
}
