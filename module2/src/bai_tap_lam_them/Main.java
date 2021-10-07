package bai_tap_lam_them;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("1. Add\n" + "2. Display\n" + "3. Edit\n" + "4. Delete\n" + "5. Search\n" + "6. Exit\n" + "Your choice:");
            StudentManager studentManager = new StudentManager();
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    studentManager.add();
                    break;
                case 2:
                    studentManager.display();
                    break;
                case 3:
                    studentManager.edit();
                    break;
                case 4:
                    studentManager.delete();
                    break;
                case 5:
                    studentManager.search();
                    break;
                case 6:
                    System.exit(0);
            }
        }

    }
}
