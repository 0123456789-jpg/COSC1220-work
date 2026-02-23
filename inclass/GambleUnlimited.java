import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-02-20
 */
public class GambleUnlimited {
    public static void main(String[] args) {
        List<Integer> intArgs = Arrays.stream(args).map(Integer::parseInt).collect(Collectors.toList());
        int stake = intArgs.get(0);
        int goal = intArgs.get(1);
        int counter = 0;
        while (stake < goal) {
            stake += Math.random() * 2 >= 1 ? 1 : -1;
            counter++;
            switch (stake) {
                case 0:
                    System.out.println("Lose in " + counter + " round(s)");
                    return;
                case 1:
                    System.out.println("Almost lose at round " + counter);
                    break;
            }
        }
        System.out.println("It takes " + counter + " round(s) to win");
    }
}
