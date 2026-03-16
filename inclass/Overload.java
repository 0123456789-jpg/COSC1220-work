/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-03-16
 */
public class Overload {
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static double max(double a, double b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        System.out.println("max(4.2, 3.6) is " + max(4.2, 3.6));
        System.out.println("max(3, 4) is " + max(3, 4));
        System.exit(255);
    }
}
