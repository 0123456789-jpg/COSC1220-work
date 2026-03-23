import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-03-23
 */
public class Package {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input: ");
        int i = s.nextInt();
        System.out.println("Output: " + i);

        SecureRandom rng = new SecureRandom();
        for (int j = 0; j < 36; j++) {
            System.out.print((rng.nextInt(6) + 1) + " ");
        }
    }
}
