package ss1_introduction_to_java.bai_tap.doc_so_thanh_chu;

import java.util.Scanner;

public class ReadNumber {

    public static String oneDigit(int number) {
        String letter = "";
        switch (number) {
            case 0:
                letter = "";
                break;
            case 1:
                letter = "one";
                break;
            case 2:
                letter = "two";
                break;
            case 3:
                letter = "three";
                break;
            case 4:
                letter = "four";
                break;
            case 5:
                letter = "five";
                break;
            case 6:
                letter = "six";
                break;
            case 7:
                letter = "seven";
                break;
            case 8:
                letter = "eight";
                break;
            case 9:
                letter = "nine";
                break;
        }
        return letter;
    }

    public static String twoDigit(int number) {
        int num = number / 10;
        int numini = number % 10;
        String letter = "";
        switch (num) {
            case 1:
                switch (numini) {
                    case 0:
                        letter = "ten";
                        break;
                    case 1:
                        letter = "eleven";
                        break;
                    case 2:
                        letter = "twelve";
                        break;
                    case 3:
                        letter = "thirteen";
                        break;
                    case 4:
                        letter = "fourteen";
                        break;
                    case 5:
                        letter = "fifteen";
                        break;
                    case 8:
                        letter = "eighteen";
                        break;
                    default:
                        letter = oneDigit(numini) + "teen";
                        break;
                }
                break;
            case 2:
                letter = "twenty " + oneDigit(numini);
                break;
            case 3:
                letter = "thirty " + oneDigit(numini);
                break;
            case 4:
                letter = "forty " + oneDigit(numini);

                break;
            case 5:
                letter = "fifty " + oneDigit(numini);

                break;
            case 8:
                letter = "eighty " + oneDigit(numini);

                break;
            default:
                letter = oneDigit(num) + "ty " + oneDigit(numini);

        }
        return letter;
    }

    public static String threeDigit(int number) {
        int num = number / 100;
        int numini = number % 100;
        String letter = "";
        if (numini == 0 && num > 0) {
            letter = oneDigit(num) + " hundred";
        } else if (numini >= 0 && numini <= 9 && num > 0) {
            letter = oneDigit(num) + " hundred and " + oneDigit(numini);
        } else {
            letter = oneDigit(num) + " hundred and " + twoDigit(numini);
        }
        return letter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int input = Integer.parseInt(sc.nextLine());
        if (input > 0 && input <= 9) {
            System.out.println("Read numbers into words: " + oneDigit(input));
        } else if (input >= 10 && input < 100) {
            System.out.println("Read numbers into words: " + twoDigit(input));
        } else if (input >= 100 && input < 1000) {
            System.out.println("Read numbers into words: " + threeDigit(input));
        } else {
            System.out.println("out of ability");
        }
    }


}
