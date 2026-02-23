import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Shunzhong Zhu
 * @version 0.1.1
 * @since 2026-02-20
 */
public class Triangle {
    public static void main(String[] args) {
        List<Integer> intArgs = Arrays.stream(args).map(Integer::parseInt).collect(Collectors.toList());
        int length = intArgs.get(0);
        int height = intArgs.get(1);
        boolean left = intArgs.get(2) > 0;
        boolean traverse = intArgs.get(3) > 0;
        for (int i = 0; i < height + 1; i++) {
            System.out.println(String.join("", Collections.nCopies((traverse ? length - i : i), (left ? "*" : " "))) + String.join("", Collections.nCopies((!traverse ? length - i : i), (!left ? "*" : " "))));
        }
    }
}
