package activity1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Shunzhong Zhu
 * @version 0.2.0
 * @since 2026-02-25
 */
public class Shuffle {
    public static void main(String[] args) {
        List<String> cards = new ArrayList<>();
        List<String> nums = Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A");
        List<String> suits = Arrays.asList("Spade", "Heart", "Diamond", "Club");
        for (String num : nums) {
            for (String suit : suits) {
                cards.add(suit + "-" + num);
            }
        }
        List<String> shuffled = new ArrayList<>();
        System.out.println("Shuffled cards:");
        for (int i = cards.size(); i > 0; i--) {
            String selected = cards.remove((int) Math.floor(Math.random() * i));
            System.out.println(selected);
            shuffled.add(selected);
        }
        System.out.println();
        for (int i = 1; i < 5; i++) {
            System.out.println("Cards for player " + i + ":");
            for (int j = 0; j < 5; j++) {
                System.out.println(shuffled.remove(0));
            }
        }
    }
}
