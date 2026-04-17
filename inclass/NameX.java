import java.util.Scanner;

/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-04-17
 */
public class NameX {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = s.next();
        System.out.println("Your name " + (name.endsWith("x") ? "ends" : "doesn't end") + " with \"x\"");
    }
}
