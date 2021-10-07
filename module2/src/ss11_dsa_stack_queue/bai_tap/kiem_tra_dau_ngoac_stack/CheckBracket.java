package ss11_dsa_stack_queue.bai_tap.kiem_tra_dau_ngoac_stack;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public String string;
    public String[] array;


    public CheckBracket() {
    }

    public CheckBracket(String string, String[] array) {
        this.string = string;
        this.array = array;
    }


    public boolean isMatching() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input any string");
        string = sc.nextLine();
        array = string.split("");

        Stack<String> stack = new Stack<>();
        Stack<String> left = new Stack<>();

        boolean isCompare;
        for (String a : array) {
            if (a.equals("(")) {
                stack.push(a);
            } else if (a.equals(")")) {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    left.push(a);
                }
            }
        }
        isCompare = (stack.size() == left.size());
        return isCompare;

    }
}


