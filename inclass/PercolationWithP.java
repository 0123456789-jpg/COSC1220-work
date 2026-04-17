// Modify this file to test your code for different values of p. What p results in half of the arrays percolating? Does this hold for different sizes of arrays?

import java.util.Scanner;

/**
 * @author Shunzhong Zhu
 * @version 0.2.0
 * @since 2026-04-13
 */
public class PercolationWithP {

    public static boolean[][] flow(boolean[][] isOpen) {
        int n = isOpen.length;
        boolean[][] isFull = new boolean[n][n];

        for (int j = 0; j < n; j++) {
            flow(isOpen, isFull, 0, j);
        }
        return isFull;
    }

    public static void flow(boolean[][] isOpen, boolean[][] isFull, int i, int j) {

        int n = isOpen.length;
        if (i < 0 || i >= n || j < 0 || j >= n) {
            return;
        }
        if (!isOpen[i][j] || isFull[i][j]) {
            return;
        }

        isFull[i][j] = true;

        flow(isOpen, isFull, i + 1, j);
        flow(isOpen, isFull, i, j + 1);
        flow(isOpen, isFull, i, j - 1);
        flow(isOpen, isFull, i - 1, j);
    }

    public static boolean percolates(boolean[][] isOpen) {
        int n = isOpen.length;
        boolean[][] isFull = flow(isOpen);

        for (boolean j : isFull[n - 1]) {         // new for loop style
            if (j) {
                return true;
            }
        }
        return false;
    }

    public static boolean[][] random(int n, double p) {
        boolean[][] a = new boolean[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = !(Math.random() > p);
        return a;
    }

    private static int simulate(int n, int s, double p) {
        int x = 0;
        for (int i = 0; i < s; i++) {
            boolean[][] isOpen = random(n, p);
            if (percolates(isOpen)) x++;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input array size: ");
        int n = sc.nextInt();
        System.out.print("Input simulation number: ");
        int s = sc.nextInt();
        System.out.print("Input open possibility: ");
        double p = sc.nextDouble();
        int x = simulate(n, s, p);
        // System.out.println(x);
        System.out.println("Percolation possibility is " + (double) x / s);
    }
}