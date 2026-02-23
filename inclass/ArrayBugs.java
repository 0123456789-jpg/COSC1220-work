public class ArrayBugs {
    public static void main(String[] args) {
        /// block of code #1:
        double[] array1 = new double[10];
        for (int i = 1; i <= 10; i++) {
            array1[i - 1] = Math.random();
        }

        /// block of code #2:
        double[] array2 = new double[10];
        for (int i = 0; i < 9; i++) {
            array2[i] = Math.random();
        }

        /// block of code #3:
        double[] array3 = new double[10];
        for (int i = 0; i < 10; i++) {
            array3[i] = Math.random();
        }
    }
}