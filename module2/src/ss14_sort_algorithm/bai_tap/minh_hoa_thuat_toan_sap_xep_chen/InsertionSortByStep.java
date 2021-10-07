package ss14_sort_algorithm.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;


import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = Integer.parseInt(sc.nextLine());
        int[] list = new int[n];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.print("Your input list: ");
        for (int e : list) {
            System.out.print(e + " ");
        }

        System.out.println("\nBegin sort processing...");
        insertionSort(list);

    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int j;
            int x = list[i];
            for (j = i - 1; j >= 0 && list[j] > x; j--) {
                System.out.println("Swap " + list[j] + " with " + x);
                list[j + 1] = list[j];
            }

            list[j + 1] = x;

            System.out.print("List after the  " + i + "' sort: ");
            for (int e : list) {
                System.out.print(e + " ");
            }
            System.out.println();

        }

    }

}
