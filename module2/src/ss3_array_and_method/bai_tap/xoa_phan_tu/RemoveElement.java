package ss3_array_and_method.bai_tap.xoa_phan_tu;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static int[] removeTheElement(int[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }
        int[] newArray = new int[arr.length - 1];

        for (int i = 0, k = 0; i < arr.length; i++) {

            if (i == index) {
                continue;
            }

            newArray[k++] = arr[i];
        }

        return newArray;
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

        System.out.println("Original Array: " + Arrays.toString(arr));

        System.out.println("Enter the index to be removed");

        int index = Integer.parseInt(sc.nextLine());

        System.out.println("Index to be removed: " + index);

        arr = removeTheElement(arr, index);

        System.out.println("Resultant Array: " + Arrays.toString(arr));
    }
}
