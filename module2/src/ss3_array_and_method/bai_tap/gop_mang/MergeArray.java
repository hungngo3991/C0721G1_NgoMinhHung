package ss3_array_and_method.bai_tap.gop_mang;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N of the first array");
        int N = Integer.parseInt(sc.nextLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Enter the element of the first array " + i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }


        System.out.println("Enter N of the second array");
        int N2 = Integer.parseInt(sc.nextLine());

        int[] arr2 = new int[N];

        for (int i = 0; i < N2; i++) {
            System.out.println("Enter the element of the second array " + i);
            arr2[i] = Integer.parseInt(sc.nextLine());
        }

        int[] arr3 = new int[N + N2];
        System.arraycopy(arr, 0, arr3, 0, N);
        System.arraycopy(arr2, 0, arr3, N, N2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
