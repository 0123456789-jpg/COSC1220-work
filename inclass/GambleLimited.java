import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-02-20
 */
public class GambleLimited {
    public static void main(String[] args) {
        List<Integer> intArgs = Arrays.stream(args).map(Integer::parseInt).collect(Collectors.toList());
        int stake = intArgs.get(0);
        int goal = intArgs.get(1);
        int trials = intArgs.get(2);
        for (int i = 0; i < trials; i++) stake += Math.random() * 2 >= 1 ? 1 : -1;
        System.out.println("Final balance: $" + stake);
        System.out.println(stake >= goal ? "Win" : "Lose");
    }
}
