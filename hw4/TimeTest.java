/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-05-03
 */
public class TimeTest {
    public static void main(String[] args) {
        // Create a Time object.
        Time time = new Time(1, 58, 59);
        // Output.
        System.out.println("Initial time: " + time);
        // Increment second.
        time.tick();
        // Output.
        System.out.println("Time after tick(): " + time);
        // Increment minute.
        time.incrementMinute();
        // Output.
        System.out.println("Time after incrementMinute(): " + time);
        // Increment hour.
        time.incrementHour();
        // Output.
        System.out.println("Time after incrementHour(): " + time);
    }
}
