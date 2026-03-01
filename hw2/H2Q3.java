import java.util.Collections;

/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-02-28
 */
public class H2Q3 {
    public static void main(String[] args) {
        // Parse matrix size
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        // Allocate transposed matrix
        int[][] matrix = new int[y][x];
        // Allocate numbers' lengths array for formatting
        int[][] lens = new int[y][x];
        // The maximum length among numbers in the matrix
        int maxLen = 0;
        // Logic loop
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                // Parse matrix input
                int num = Integer.parseInt(args[2 + y * i + j]);
                // Place number in transposed position
                matrix[j][i] = num;
                // Calculate the length of the current number
                int len = (num >= 0) ? 0 : 1;
                if (Math.abs(num) <= 1) {
                    len += 1;
                } else {
                    len += (int) Math.ceil(Math.log10(Math.abs(num))) + (num % 10 == 0 ? 1 : 0);
                }
                // Store it
                lens[j][i] = len;
                // Update max length
                maxLen = Math.max(maxLen, len);
            }
        }
        // Output loop
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                // Output number with calculated padding
                System.out.print(matrix[i][j] + String.join("", Collections.nCopies(maxLen - lens[i][j] + 1, " ")));
            }
            // Formatting
            System.out.println();
        }
    }
}
