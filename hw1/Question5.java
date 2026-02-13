import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-02-13
 */
public class Question5 {
    public static void main(String[] args) {
        List<Double> doubleArgs = Arrays.stream(args).map(Double::parseDouble).collect(Collectors.toList());
        double T = doubleArgs.get(0);
        double v = doubleArgs.get(1);
        boolean err = false;
        if (Math.abs(T) > 50) {
            System.out.println("|T|<=50F is not satisfied");
            err = true;
        }
        if (v < 3 || v > 120) {
            System.out.println("3mph<=v<=120mph is not satisfied");
            err = true;
        }
        if (err) return;
        double w = 35.74 + 0.6215 * T + (0.4275 * T - 35.75) * Math.pow(v, 0.16);
        System.out.println("The Wind Chill is " + w);
    }
}
