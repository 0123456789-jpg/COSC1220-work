import java.util.Arrays;

/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-02-25
 */
public class Pointer {
    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {1, 2};
        System.out.println(a == b);
        System.out.println(Arrays.equals(a, b));
        System.out.println(a);
    }
}
