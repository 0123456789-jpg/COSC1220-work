import java.util.Scanner;

/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-03-30
 */
public class Hanoi {
    private static void hanoi(int x, boolean left) {
        if (x == 0) return;
        hanoi(x - 1, !left);
        System.out.print(x + (left ? "L" : "R") + " ");
        hanoi(x - 1, !left);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input an integer: ");
        hanoi(s.nextInt(), true);
    }
}
