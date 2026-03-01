import java.util.Arrays;
import java.util.stream.DoubleStream;

/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-02-28
 */
public class H2Q1 {
    public static void main(String[] args) {
        // Parse argument
        int n = Integer.parseInt(args[0]);
        // Create 2 random double arrays
        double[] arr1 = DoubleStream.generate(Math::random).limit(n).toArray();
        double[] arr2 = DoubleStream.generate(Math::random).limit(n).toArray();
        // Intermediate value
        double last = 0.0;
        // Compute
        for (int i = 0; i < n; i++) {
            last = Math.hypot(last, Math.abs(arr1[i] - arr2[i])); // This prevents overflow
        }
        // Output
        System.out.println("The Euclidean distance between " + Arrays.toString(arr1) + " and " + Arrays.toString(arr2) + " is " + last);
    }
}
