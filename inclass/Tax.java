/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-02-20
 */
public class Tax {
    public static void main(String[] args) {
        double income = Double.parseDouble(args[0]);
        int rate = 35;
        if (income < 0) rate = 0;
        if (income < 47450) rate = 22;
        if (income < 114650) rate = 25;
        if (income < 174700) rate = 28;
        if (income < 311950) rate = 33;
        System.out.println(rate / 100.);
    }
}
