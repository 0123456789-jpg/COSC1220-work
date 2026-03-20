/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-03-18
 */
public class Stat {
    private static double pdf(double x, double mean, double stdDev) {
        return Math.exp(-Math.pow((x - mean) / stdDev, 2) / 2) / (Math.sqrt(2 * Math.PI) * stdDev);
    }

    private static double cdf(double x, double mean, double stdDev) {
        double sum = 0;
        double term = x;
        for (long i = 3; sum + term != sum; i += 2) {
            sum += term;
            term *= x * x / i;
        }
        return 0.5 + pdf(x, mean, stdDev) * sum;
    }

    public static void main(String[] args) {
        double meanCm = 170.6;
        double stdDevCm = 13.17;
        double meanInches = 67.17;
        double stdDevInches = 5.2;
        System.out.println(pdf(3, 0, 1));
        System.out.println(pdf(74, meanInches, stdDevInches));
        System.out.println(pdf(165, meanCm, stdDevCm));
        System.out.println();
        System.out.println(cdf(169, meanCm, stdDevCm)); // FIXME: NaN
    }
}
