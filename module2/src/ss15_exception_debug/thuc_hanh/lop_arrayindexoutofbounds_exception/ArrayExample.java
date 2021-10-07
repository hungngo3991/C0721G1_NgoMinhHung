package ss15_exception_debug.thuc_hanh.lop_arrayindexoutofbounds_exception;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {

    public Integer[] createRandom() {
        Random random = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("List of array elements: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease enter the index of any element: ");
        int x = sc.nextInt();
        try {
            System.out.println("The value of the element with index " + x + " is " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("The index exceeds the limit of the array");
        }
    }
}
