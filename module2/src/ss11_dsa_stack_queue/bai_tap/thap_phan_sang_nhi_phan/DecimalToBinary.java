package ss11_dsa_stack_queue.bai_tap.thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Enter a decimal number: ");
        int number = Integer.parseInt(sc.nextLine());

        while (number > 0) {
            int r = number % 2;
            stack.push(r);
            number /= 2;
        }

        System.out.print("Binary number: ");

        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());
        }
    }
}
