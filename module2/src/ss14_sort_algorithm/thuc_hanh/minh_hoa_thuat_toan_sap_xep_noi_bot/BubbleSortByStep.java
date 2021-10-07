package ss14_sort_algorithm.thuc_hanh.minh_hoa_thuat_toan_sap_xep_noi_bot;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = Integer.parseInt(sc.nextLine());
        int[] list = new int[n];
        System.out.print("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.print("Your input list: ");
        for (int e : list) {
            System.out.print(e + " ");
        }

        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list) {
        boolean needSort = true;
        for (int j = 1; j < list.length && needSort; j++) {
            needSort = false;
            for (int i = 0; i < list.length - j; i++) {
                if (list[i] > list[i + 1]) {
                    System.out.println("Swap " + list[i] + " with " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needSort = true;
                }
            }

            if (!needSort) {
                System.out.println("Array may be sorted and next arrangement not needed");
                break;
            }

            System.out.print("List after the  " + j + "' sort: ");
            for (int e : list) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }


}
