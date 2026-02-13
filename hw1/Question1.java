import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-02-12
 */
public class Question1 {
    public static void main(String[] args) {
        // Parse arguments into int.
        List<Integer> intArgs = Arrays.stream(args).map(Integer::parseInt).collect(Collectors.toList());
        // Check odd/even.
        intArgs.forEach(i -> System.out.println(i + " is " + (i % 2 == 0 ? "even" : "odd")));
        // Check +/-/0.
        intArgs.forEach(i -> {
            String type;
            if (i == 0) {
                type = "zero";
            } else if (i > 0) {
                type = "positive";
            } else {
                type = "negative";
            }
            System.out.println(i + " is " + type);
        });
        // Extract numbers from the list for convenience.
        int x = intArgs.get(0);
        int y = intArgs.get(1);
        // Check if x is a multiple of y and vice versa.
        printIsMultiple(x, y);
        printIsMultiple(y, x);
        // Output the sum of x and y.
        System.out.println("The sum of " + x + " and " + y + " is " + (x + y));
        // Output the product of x and y.
        System.out.println("The product of " + x + " and " + y + " is " + (x * y));
        // Output x-y and vice versa.
        printDifference(x, y);
        printDifference(y, x);
        // Output x/y and vice versa.
        printQuotient(x, y);
        printQuotient(y, x);
        // Compare x and y.
        if (x == y) {
            System.out.println(x + " and " + y + " are equal");
        } else {
            System.out.println(Math.max(x, y) + " is larger than " + Math.min(x, y));
        }
        // Calculate the Euclidean distance.
        System.out.println("The Euclidean distance from (" + x + "," + y + ") to the origin (0,0) is " + Math.sqrt(x * x + y * y));
    }

    /**
     * Shorthand method for printing requirement <code>c</code>.
     */
    private static void printIsMultiple(int x, int y) {
        System.out.println(x + " is" + (x == 0 || (y != 0 && x % y == 0) /* Handle edge case */ ? "" : " not") + " a multiple of " + y);
    }

    /**
     * Shorthand method for printing requirement <code>d</code>.
     */
    private static void printDifference(int x, int y) {
        System.out.println("The difference of " + x + " and " + y + " is " + (x - y));
    }

    /**
     * Shorthand method for printing requirement <code>d</code>.
     */
    private static void printQuotient(double x, double y) {
        System.out.println("The quotient of " + x + " and " + y + (y == 0 ? " does not exist" : " is " + (x / y)));
    }
}
