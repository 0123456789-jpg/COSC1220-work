import java.security.SecureRandom;

public class Craps {
    private static boolean play(SecureRandom rng) {
        int initialRoll = rng.nextInt(6) + rng.nextInt(6) + 2;
        if (initialRoll == 7 || initialRoll == 11) {
            return true;
        } else if (initialRoll == 2 || initialRoll == 3 || initialRoll == 12) {
            return false;
        } else {
            while (true) {
                int reroll = rng.nextInt(6) + rng.nextInt(6) + 2;
                if (reroll == initialRoll) {
                    return true;
                } else if (reroll == 7) {
                    return false;
                }
            }
        }
    }

    public static void main(String[] args) {
        SecureRandom rng = new SecureRandom();
        final int testCount = 1000000;
        int wins = 0;
        for (int i = 0; i < testCount; i++) {
            if (play(rng)) wins++;
        }
        System.out.println("P of winning: " + (wins / (double) testCount));
    }
}