package ss2_loop_in_java.bai_tap.hien_thi_nguyen_to_nhohonN;

import java.util.Scanner;

public class LessThanN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N?");
        int numbers = Integer.parseInt(sc.nextLine());
        int N = 2;
        while (N <= numbers){
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(N)) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(N);
            }
            N++;
        }
    }
}
