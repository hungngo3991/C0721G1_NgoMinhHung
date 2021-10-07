package ss8_clean_code.bai_tap.refactoring;

public class Main {
    public static void main(String[] args) {
        System.out.println(TennisGame.getScore(0, 0));
        System.out.println(TennisGame.getScore(1, 1));
        System.out.println(TennisGame.getScore(2, 2));
        System.out.println(TennisGame.getScore(3, 3));
        System.out.println(TennisGame.getScore(4, 4));

        System.out.println(TennisGame.getScore(5, 4));
        System.out.println(TennisGame.getScore(4, 5));
        System.out.println(TennisGame.getScore(6, 4));
        System.out.println(TennisGame.getScore(4, 6));

    }


}
