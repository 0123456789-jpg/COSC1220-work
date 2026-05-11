import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;

/**
 * @author Shunzhong Zhu
 * @version 0.1.1
 * @since 2026-05-11
 */
public class Nums {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("nums.txt");
        SecureRandom rng = new SecureRandom();
        for (int i = 0; i < 1000; i++)
            switch (rng.nextInt(5)) {
                case 0:
                    writer.write("Zero");
                    break;
                case 1:
                    writer.write("One");
                    break;
                case 2:
                    writer.write("Two\n");
                    break;
                case 3:
                    writer.write("Three");
                    break;
                case 4:
                    writer.write("Four");
                    break;
                default:
                    throw new RuntimeException("Unreachable");
            }
    }
}
