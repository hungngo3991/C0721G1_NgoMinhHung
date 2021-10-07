package ss4_class_and_object.bai_tap.stop_watch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println(stopWatch.getStartTime());

        int a = 0;
        for (int i = 0; i <= 10000000; i++) {
            for (int j = 0; j < 100000; j++) {
                a = i + j;
            }
        }
        stopWatch.stop();
        System.out.println(stopWatch.getEndTime());
        System.out.println(stopWatch.getElapsedTime());
    }
}
