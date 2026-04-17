import java.util.Scanner;

/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-04-17
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input your string here: ");
        String str = s.next();
        int len = str.length();
        boolean palindrome = true;
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                palindrome = false;
                break;
            }
        }
        System.out.println("Your string is " + (palindrome ? "" : "not ") + "a palindrome");
    }
}
