package ss3_array_and_method.bai_tap.them_phan_tu;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static int[] addElement(int n, int[] arr, int x, int pos) {

        int[] newarr = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            if (i < pos) {
                newarr[i] = arr[i];
            } else if (i == pos) {
                newarr[i] = x;
            } else {
                newarr[i] = arr[i - 1];
            }
        }
        return newarr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N elements");
        int N = Integer.parseInt(sc.nextLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Enter the element " + i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }


        System.out.println("Original Array:\n" + Arrays.toString(arr));

        System.out.println("Enter x");
        int x = Integer.parseInt(sc.nextLine());

        System.out.println("Enter pos");
        int pos = Integer.parseInt(sc.nextLine());

        arr = addElement(N, arr, x, pos);

        System.out.println("\nResultant Array with " + x
                + " inserted at position "
                + pos + ":\n"
                + Arrays.toString(arr));
    }
}
