import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-03-24
 */
public class HW3 {
    /**
     * The gravitational constant.
     */
    private static final double G = 6.6743e-11;
    /**
     * The gravitational acceleration.
     */
    private static final double g = 9.8;

    /**
     * Shorthand method for printing requirement <code>1c</code>.
     */
    private static void printIsMultiple(int x, int b) {
        System.out.println(x + " is" + (x == 0 || (b != 0 && x % b == 0) /* Handle edge case */ ? "" : " not") + " a multiple of " + b);
    }

    /**
     * Logic and output for part 1.
     */
    private static void twoNumbers(int a, int b) {
        List<Integer> list = Arrays.asList(a, b);
        // Check odd/even.
        list.forEach(i -> System.out.println(i + " is " + (i % 2 == 0 ? "even" : "odd")));
        // Check +/-/0.
        list.forEach(i -> {
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
        // Check if a is a multiple of b and vice versa.
        printIsMultiple(a, b);
        printIsMultiple(b, a);
        // Compare a and b.
        if (a == b) {
            System.out.println(a + " and " + b + " are equal");
        } else {
            System.out.println(Math.max(a, b) + " is larger than " + Math.min(a, b));
        }
        // Calculate the Euclidean distance.
        System.out.println("The Euclidean distance from (" + a + "," + b + ") to the origin (0,0) is " + Math.hypot(a, b));
    }

    /**
     * Logic and output for part 2.
     *
     * @param mass1  The first mass measured in kilograms.
     * @param mass2  The second mass measured in kilograms.
     * @param radius The distance between two masses measured in meters.
     */
    private static void gravitationalForce(double mass1, double mass2, double radius) {
        // Compute the force.
        double force = G * mass1 * mass2 / (radius * radius);
        // Output.
        System.out.println("F = " + force + " N");
    }

    /**
     * Logic and output for part 3.
     *
     * @param x Initial displacement in meters.
     * @param v Initial velocity in meters per second.
     * @param t Time in seconds.
     */
    private static void displacement(double x, double v, double t) {
        // Compute displacement.
        double displacement = x + v * t - g * t * t / 2;
        // Output.
        System.out.println("The displacement is " + displacement + " m");
    }

    /**
     * Logic and output for part 4.
     *
     * @param P Principal measured in dollars.
     * @param r Annual interest rate without percentage sign.
     * @param t Time measured in years.
     */
    private static void continuouslyCompoundedInterest(double P, double r, double t) {
        // Compute interest.
        double interest = P * Math.pow(Math.E, r * t);
        // Output everything.
        System.out.println("The principal is $" + P);
        System.out.println("The annual interest rate is %" + r * 100);
        System.out.println("The time is " + t + " year(s)");
        System.out.println("The continuously compound interest is $" + interest);
    }

    /**
     * Logic and output for part 5.
     *
     * @param T Temperature in Fahrenheit.
     * @param v Wind speed in miles per hour.
     */
    private static void windChill(double T, double v) {
        // Check if input values are allowed, printing error message(s) and exiting if not.
        boolean err = false;
        if (Math.abs(T) > 50) {
            System.out.println("|T|<=50F is not satisfied");
            err = true;
        }
        if (v < 3 || v > 120) {
            System.out.println("3mph<=v<=120mph is not satisfied");
            err = true;
        }
        if (err) return;
        // Compute Wind Chill.
        double w = 35.74 + 0.6215 * T + (0.4275 * T - 35.75) * Math.pow(v, 0.16);
        // Output.
        System.out.println("The Wind Chill is " + w);
    }

    public static void main(String[] args) {
        // Set up input scanner.
        Scanner scanner = new Scanner(System.in);

        // Prompt for part 1 inputs.
        System.out.println("Part 1");
        System.out.print("Input an integer: ");
        int a = scanner.nextInt();
        System.out.print("Input another integer: ");
        int b = scanner.nextInt();
        // Calculate and output part 1 results.
        twoNumbers(a, b);
        System.out.println();

        // Prompt for part 2 inputs.
        System.out.println("Part 2");
        System.out.print("Input mass 1 in kg: ");
        double mass1 = scanner.nextDouble();
        System.out.print("Input mass 2 in kg: ");
        double mass2 = scanner.nextDouble();
        System.out.print("Input the distance between them in m: ");
        double radius = scanner.nextDouble();
        // Calculate and output part 2 results.
        gravitationalForce(mass1, mass2, radius);
        System.out.println();

        // Prompt for part 3 inputs.
        System.out.println("Part 3");
        System.out.print("Input initial displacement in m: ");
        double x = scanner.nextDouble();
        System.out.print("Input initial velocity in m/s: ");
        double v;
        v = scanner.nextDouble();
        System.out.print("Input time in s: ");
        double t;
        t = scanner.nextFloat();
        // Calculate and output part 3 results.
        displacement(x, v, t);
        System.out.println();

        // Prompt for part 4 inputs.
        System.out.println("Part 4");
        System.out.print("Input principal in $: ");
        double P = scanner.nextDouble();
        System.out.print("Input annual interest rate without percentage sign (eg. 0.005): ");
        double r = scanner.nextDouble();
        System.out.print("Input time in years: ");
        t = scanner.nextFloat();
        // Calculate and output part 4 results.
        continuouslyCompoundedInterest(P, r, t);
        System.out.println();

        // Prompt for part 5 inputs.
        System.out.println("Part 5");
        System.out.print("Input temperature in Fahrenheit: ");
        double T = scanner.nextFloat();
        System.out.print("Input wind speed in mph: ");
        v = scanner.nextDouble();
        // Calculate and output part 5 results.
        windChill(T, v);
        System.out.println();
    }
}
