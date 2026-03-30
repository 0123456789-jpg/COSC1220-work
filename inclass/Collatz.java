import java.util.Scanner;

/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-03-30
 */
public class Collatz {
    private static void compute(int x) {
        System.out.print(x);
        if (x == 1) return;
        System.out.print(" ");
        if (x % 2 == 0) compute(x / 2);
        else compute(3 * x + 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int x = s.nextInt();
        compute(x);
    }
}
