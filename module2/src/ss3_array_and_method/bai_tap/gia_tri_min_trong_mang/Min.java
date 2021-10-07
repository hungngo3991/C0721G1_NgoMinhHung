package ss3_array_and_method.bai_tap.gia_tri_min_trong_mang;

import java.util.Arrays;
import java.util.Scanner;

public class Min {
    public static int getMin(int[] m, int N){
        int temp;
        for (int i = 0; i < N; i++)
        {
            for (int j = i + 1; j < N; j++)
            {
                if (m[i] > m[j])
                {
                    temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                }
            }
        }
        return m[0];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N elements");

        int N = Integer.parseInt(sc.nextLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            System.out.println("Enter the element " + i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Min: "+getMin(arr,N));

    }
}
