import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-02-23
 */
public class BarChart {
    public static void main(String[] args) {
        int[] arr = Stream.generate(() -> Math.ceil(Math.random() * 5)).mapToInt(Double::intValue).limit(100).toArray();
        for (int i = 0; i < 5; i++) {
            int finalI = i;
            System.out.println((i + 1) + ": " + String.join("", Collections.nCopies((int) Arrays.stream(arr).filter((x) -> x == (finalI + 1)).count(), "*")));
        }
    }
}
