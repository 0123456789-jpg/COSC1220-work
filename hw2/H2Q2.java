/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-02-28
 */
public class H2Q2 {
    public static void main(String[] args) {
        // Create arrays
        boolean[][] boolMatrix = new boolean[3][3];
        double[][] doubleMatrix = new double[3][3];
        // Compute and output in the same loops
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Populate double array
                double rand = Math.random();
                doubleMatrix[i][j] = rand;
                // Compute bool value
                boolMatrix[i][j] = rand >= 0.5;
                // Output bool value
                System.out.print(boolMatrix[i][j] ? "*" : " ");
            }
            // 3x3 format
            System.out.println();
        }
    }
}
