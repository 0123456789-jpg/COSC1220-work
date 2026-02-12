package inclass;

import java.util.Arrays;

/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-02-11
 */
public class Hello {
    public static void main(String[] args) {
        Arrays.stream(args).map(Integer::parseInt).sorted().forEach(System.out::println);
    }
}
