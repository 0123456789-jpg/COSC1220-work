import java.util.Scanner;

/**
 * @author Shunzhong Zhu
 * @version 0.1.1
 * @since 2026-03-30
 */
public class Hanoi {
    private static String hanoi(int x, boolean left) {
        if (x <= 0) return "";
        String prev = hanoi(x - 1, !left);
        return prev + x + (left ? "L" : "R") + " " + prev;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input an integer: ");
        System.out.println(hanoi(s.nextInt(), false));
    }
}
