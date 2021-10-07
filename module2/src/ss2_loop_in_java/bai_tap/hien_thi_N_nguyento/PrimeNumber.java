package ss2_loop_in_java.bai_tap.hien_thi_N_nguyento;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many primes do you want to display first?");
        int numbers = Integer.parseInt(sc.nextLine());
        int count = 0;
        int N = 2;

        while (count < numbers) {
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
                count++;
            }
            N++;
        }
    }
}
