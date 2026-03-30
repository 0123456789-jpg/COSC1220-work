import java.util.Scanner;

/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-03-30
 */
public class Int2Bin {
    private static String convert(int x) {
        if (x == 1) return "1";
        return convert(x >> 1) + x % 2;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int x = s.nextInt();
        System.out.println(convert(x));
    }
}
