import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-02-13
 */
public class Question4 {
    public static void main(String[] args) {
        // Parse args.
        List<Double> doubleArgs = Arrays.stream(args).map(Double::parseDouble).collect(Collectors.toList());
        // Extract vars.
        double P = doubleArgs.get(0);
        double r = doubleArgs.get(1);
        double t = doubleArgs.get(2);
        // Compute interest.
        double interest = P * Math.pow(Math.E, r * t);
        // Output everything.
        System.out.println("The principal is $" + P);
        System.out.println("The annual interest rate is %" + r * 100);
        System.out.println("The time is " + t + " year(s)");
        System.out.println("The continuously compound interest is $" + interest);
    }
}
