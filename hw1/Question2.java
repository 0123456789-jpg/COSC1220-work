import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-02-12
 */
public class Question2 {
    /**
     * The gravitational constant.
     */
    private static final double G = 6.6743e-11;

    public static void main(String[] args) {
        // Parsing args to double.
        List<Double> doubleArgs = Arrays.stream(args).map(Double::parseDouble).collect(Collectors.toList());
        // Extract variables from argument list.
        double mass1 = doubleArgs.get(0);
        double mass2 = doubleArgs.get(1);
        double radius = doubleArgs.get(2);
        // Compute the force.
        double force = G * mass1 * mass2 / (radius * radius);
        // Output.
        System.out.println("F = " + force + " N");
    }
}
