package ss15_exception_debug.thuc_hanh.debug_ung_dung_java;

import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a : ");
        double a = sc.nextDouble();
        System.out.print("Input b : ");
        double b = sc.nextDouble();

        if (a != 0) {
            System.out.println("result = " + (-b / a));
        } else {
            System.out.println("result is infinity");
        }
    }
}
