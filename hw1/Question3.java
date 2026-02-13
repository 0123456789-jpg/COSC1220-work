import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-02-13
 */
public class Question3 {
    /**
     * The gravitational acceleration.
     */
    private static final double g = 9.8;

    public static void main(String[] args) {
        // Parse args.
        List<Double> doubleArgs = Arrays.stream(args).map(Double::parseDouble).collect(Collectors.toList());
        // Extract vars.
        double x = doubleArgs.get(0);
        double v = doubleArgs.get(1);
        double t = doubleArgs.get(2);
        // Compute displacement.
        double displacement = x + v * t - g * t * t / 2;
        // Output.
        System.out.println("The displacement is " + displacement + " m");
    }
}
