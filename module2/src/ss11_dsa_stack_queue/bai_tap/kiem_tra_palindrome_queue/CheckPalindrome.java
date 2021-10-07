package ss11_dsa_stack_queue.bai_tap.kiem_tra_palindrome_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {

        System.out.print("Input string:");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        Queue queue = new LinkedList();

        for (int i = string.length() - 1; i >= 0; i--) {
            queue.add(string.charAt(i));
        }

        String reverse = "";

        while (!queue.isEmpty()) {
            reverse = reverse + queue.remove();
        }
        if (string.equals(reverse)) {
            System.out.println("The input String is a palindrome.");
        } else {
            System.out.println("The input String is not a palindrome.");
        }

    }
}
