import java.util.Scanner;

/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-04-08
 */
public class Fibonacci {
    private static int fib(int x) {
        if (x <= 0) return 0;
        if (x == 1) return 1;
        return fib(x - 1) + fib(x - 2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input an integer: ");
        System.out.println("The nth number of the Fibonacci sequence is " + fib(s.nextInt()));
    }
}
