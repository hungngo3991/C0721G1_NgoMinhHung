package giaithuat_14092021;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        displayTriangle();
    }

    public static void displayTriangle() {
        int temp = 9;
        String string = " ";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < temp; j++) {
                if (i == 1 && (j == 1 || j == 2 || j == 4 || j == 5)) {
                    System.out.print(" ");
                } else if (i == 2 && (j == 1 || j == 3)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            temp = temp - 2;

            System.out.println("");
            System.out.print(string);
            string = string + " ";

        }
    }
}
