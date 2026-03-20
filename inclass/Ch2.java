import java.util.Arrays;

/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-03-20
 */
public class Ch2 {
    private static double mean(double[] arr) {
        return Arrays.stream(arr).sum() / arr.length;
    }

    private static double standardDeviation(double[] arr) {
        double mean = mean(arr);
        double squared = mean(Arrays.stream(arr).map((d) -> Math.pow(d - mean, 2)).toArray());
        return Math.sqrt(squared);
    }

    private static double sampleStandardDeviation(double[] arr) {
        double mean = mean(arr);
        double squared = Arrays.stream(arr).map((d) -> Math.pow(d - mean, 2)).sum() / (arr.length - 1);
        return Math.sqrt(squared);
    }

    public static void main(String[] args) {
        double[] test = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println(Arrays.toString(test));
        System.out.println("Mean = " + mean(test));
        System.out.println("Standard deviation = " + standardDeviation(test));
        System.out.println("Sample standard deviation = " + sampleStandardDeviation(test));
    }
}
