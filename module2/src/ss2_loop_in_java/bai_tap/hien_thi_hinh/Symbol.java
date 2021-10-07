package ss2_loop_in_java.bai_tap.hien_thi_hinh;

import java.util.Scanner;

public class Symbol {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle ");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Please enter the height of the rectangle: ");
                    int height = Integer.parseInt(sc.nextLine());
                    System.out.println("Please enter the width of the rectangle: ");
                    int width = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Enter the side of the right triangle: ");
                    int side = Integer.parseInt(sc.nextLine());
                    System.out.println("In hình tam giác vuông, có cạnh góc vuông ở: " + "1. ở top-left "
                            + "2. ở top-right " + "3. ở botton-left " + "4. ở botton-right");
                    int choicemini = Integer.parseInt(sc.nextLine());
                    switch (choicemini) {
                        case 1:
                            for (int a = side; a > 0; a--) {
                                for (int b = 1; b <= a; b++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            for (int x = 0; x < side; x++) {
                                for (int y = 0; y < side; y++) {
                                    if (y < x) {
                                        System.out.print(" ");
                                    } else {
                                        System.out.print("*");
                                    }
                                }
                                System.out.println();
                            }
                            break;
                        case 3:
                            for (int h = 1; h <= side; h++) {
                                for (int k = 1; k <= h; k++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
                            for (int e = 0; e < side; e++) {
                                for (int f = side - e; f > 0; f--) {
                                    System.out.print(" ");
                                }
                                for (int g = 1; g <= e + 1; g++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Enter the height of the isosceles triangle: ");

                    int h = Integer.parseInt(sc.nextLine());

                    for (int m = 0; m < h; m++) {
                        for (int n = h - m; n > 0; n--) {
                            System.out.print(" ");
                        }
                        for (int v = 1; v <= m * 2 + 1; v++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Not in the menu, please re-enter");
            }
        }
    }
}
