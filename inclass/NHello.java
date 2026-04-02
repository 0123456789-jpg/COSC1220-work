import java.util.Scanner;

/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-04-01
 */
public class NHello {
    private static void helloLoop(int n) {
        for (int i = 0; i < n; i++) System.out.println("Hello");
    }

    private static void helloRecursive(int n) {
        if (n == 0) return;
        System.out.println("Hello");
        helloRecursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input an integer: ");
        helloRecursive(s.nextInt());
    }
}
