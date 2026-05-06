import java.util.Arrays;

/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-05-06
 */
public class RefVar {
    private int x;

    public RefVar(int y) {
        x = y;
    }

    public static void main(String[] args) {
        int[] x = {1, 2, 3};
        int[] y = Arrays.copyOf(x, 3);
        y[1] *= 2;
        System.out.println("x = " + Arrays.toString(x));
        System.out.println("y = " + Arrays.toString(y));
    }
}
