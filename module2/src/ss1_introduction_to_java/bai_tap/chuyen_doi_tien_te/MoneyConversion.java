package ss1_introduction_to_java.bai_tap.chuyen_doi_tien_te;

import java.util.Scanner;

public class MoneyConversion {

    public static float VNDtoUSD (float vnd) {
        float usd = vnd / 23000;
        return usd;
    }
    public static float USDtoVND (float usd) {
        float vnd = usd * 23000;
        return vnd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float vnd, usd;
        int number;
        do {
            System.out.println("1. Convert VND to USD");
            System.out.println("2. Convert USD to VND");
            System.out.println("3. Exit");
            number = sc.nextInt();

            switch (number) {
                case 1: {
                    System.out.println("Input VND: ");
                    vnd = sc.nextFloat();
                    System.out.println("VND to USD: " + VNDtoUSD(vnd));
                    break;
                }
                case 2:{
                    System.out.println("Input USD: ");
                    usd = sc.nextFloat();
                    System.out.println("USD to VND: " + USDtoVND(usd));
                    break;
                }
                case 3:
                    System.exit(0);
                default:
                    System.out.println("You entered it wrong. Please re-enter!");
            }
        } while (number != 3);
    }
}
