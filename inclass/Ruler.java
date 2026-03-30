import java.util.Scanner;

/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-03-30
 */
public class Ruler {
    private static String ruler(int total, int x) {
        if (x == 0) return " ";
        return ruler(total, x - 1) + (total - x) + ruler(total, x - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int x = s.nextInt();
        System.out.println(ruler(x, x));
    }
}
