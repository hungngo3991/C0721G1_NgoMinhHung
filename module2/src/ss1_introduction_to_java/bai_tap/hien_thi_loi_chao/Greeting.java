package ss1_introduction_to_java.bai_tap.hien_thi_loi_chao;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello: " + name);
    }
}
