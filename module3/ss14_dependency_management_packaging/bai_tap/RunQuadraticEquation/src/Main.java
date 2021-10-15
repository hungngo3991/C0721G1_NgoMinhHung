import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find the solution of the quadratic equation: ax^2 + bx + c = 0");

        System.out.print("Input a: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("Input b: ");
        int b = Integer.parseInt(sc.nextLine());;
        System.out.print("Input c: ");
        int c = Integer.parseInt(sc.nextLine());

        LiCode.solveEquation(a, b, c);

    }
}
