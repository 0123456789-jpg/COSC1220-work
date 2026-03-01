import java.util.Collections;
import java.util.stream.IntStream;

/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-02-28
 */
public class H2Q4 {
    public static void main(String[] args) {
        // Generate ramdom dice sum array
        int[] arr = IntStream.generate(() -> roll() + roll()).limit(1000).toArray();
        // Allocate frequency array
        int[] freq = new int[11];
        // Compute frequency
        for (int x : arr) freq[x - 2]++;
        // Output bar chart for each sum's frequency
        for (int i = 0; i < 11; i++)
            System.out.println("Sum " + (i + 2) + (i + 2 < 10 ? " " : "") + ": " + String.join("", Collections.nCopies(freq[i], "*")) + " " + freq[i]);
    }

    /**
     * Roll dice for once.
     *
     * @return number rolled
     */
    private static int roll() {
        return (int) Math.ceil(Math.random() * 6);
    }
}
