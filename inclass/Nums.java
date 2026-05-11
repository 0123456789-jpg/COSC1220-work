import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;

/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-05-11
 */
public class Nums {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("nums.txt");
        SecureRandom rng = new SecureRandom();
        for (int i = 0; i < 1000; i++)
            writer.write(rng.nextInt(999) + "\n");
    }
}
