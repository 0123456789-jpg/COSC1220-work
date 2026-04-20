import java.security.SecureRandom;

/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-04-20
 */
public class Stopwatch {
    private final long start;

    public Stopwatch() {
        this.start = System.currentTimeMillis();
    }

    public static void main(String[] args) {
        Stopwatch sw = new Stopwatch();
        SecureRandom rng = new SecureRandom();
        int millis = 1000 + rng.nextInt(2000);
        System.out.println("Will sleep " + millis / 1000.0 + " seconds");
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(sw.secondElapsed() + " seconds have elapsed");
    }

    public double secondElapsed() {
        return (System.currentTimeMillis() - this.start) / 1000.0;
    }
}
