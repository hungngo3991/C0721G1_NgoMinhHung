package ss3_array_and_method.bai_tap.phan_tu_max_mang_2chieu;

import java.util.Arrays;
import java.util.Scanner;

public class Max {
    public static int getMax(int[][] arrays) {
        int max = arrays[0][0];
        for (int[] array : arrays) {
            for (int j : array) {
                if (j > max) {
                    max = j;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m: ");
        int m = Integer.parseInt(sc.nextLine());
        System.out.println("Enter n: ");
        int n = Integer.parseInt(sc.nextLine());

        int[][] data = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Please enter the value at index: " + i + " | " + j);
                data[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        System.out.println(Arrays.deepToString(data));
        System.out.println("The max element in data two-dimensional array is " + getMax(data));

    }
}

