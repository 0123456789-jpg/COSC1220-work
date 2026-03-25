import java.security.SecureRandom;

public class CrapsLoaded {
    private static int roll(SecureRandom rng, double p1) {
        double random = rng.nextDouble();
        double p6 = 1.0 / 3.0 - p1;
        if (random < p6) {
            return 6;
        } else if (random < p1 + p6) {
            return 1;
        } else {
            return rng.nextInt(2, 6);
        }
    }

    private static boolean play(SecureRandom rng, double p1) {
        int initialRoll = roll(rng, p1) + roll(rng, p1);
        if (initialRoll == 7 || initialRoll == 11) {
            return true;
        } else if (initialRoll == 2 || initialRoll == 3 || initialRoll == 12) {
            return false;
        } else {
            while (true) {
                int reroll = roll(rng, p1) + roll(rng, p1);
                if (reroll == initialRoll) {
                    return true;
                } else if (reroll == 7) {
                    return false;
                }
            }
        }
    }

    public static void main(String[] args) {
        double p1 = Double.parseDouble(args[0]);
        if (p1 < 0 || p1 > (1.0 / 6.0)) {
            System.out.println("0<=p1<=(1/6) not satisfied");
            return;
        }

        SecureRandom rng = new SecureRandom();
        final int testCount = 1000000;
        int wins = 0;
        for (int i = 0; i < testCount; i++) {
            if (play(rng, p1)) wins++;
        }
        System.out.println("P of winning: " + (wins / (double) testCount));
    }
}