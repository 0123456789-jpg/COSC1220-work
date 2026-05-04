/**
 * @author Shunzhong Zhu
 * @version 0.1.3
 * @since 2026-04-22
 */
public class Time {
    private int hour;
    private int minute;
    private int second;

    /**
     * Construct a Time object with default 00:00:00.
     */
    public Time() {
        this(0);
    }

    /**
     * Construct a Time object with [hour]:00:00.
     */
    public Time(int hour) {
        this(hour, 0);
    }

    /**
     * Construct a Time object with [hour]:[minute]:00.
     */
    public Time(int hour, int minute) {
        this(hour, minute, 0);
    }

    /**
     * Construct a Time object with [hour]:[minute]:[second].
     */
    public Time(int hour, int minute, int second) {
        this.setTime(hour, minute, second);
    }

    /**
     * Construct a Time object by copying an existing Time object.
     *
     * @param time Copying target.
     */
    public Time(Time time) {
        this(time.hour, time.minute, time.second);
    }

    /**
     * Helper method for printing time in 24-hour format with a prefix.
     *
     * @param header Prefix.
     * @param t      Time.
     */
    private static void displayTime(String header, Time t) {
        System.out.printf("%s%nUniversal Time: %s%nStandard time: %s%n", header, t.toUniversalString(), t);
    }

    public int getHour() {
        // Read hour.
        return hour;
    }

    public void setHour(int hour) {
        // Write hour.
        this.hour = hour;
    }

    public int getMinute() {
        // Read minute.
        return minute;
    }

    public void setMinute(int minute) {
        // Write minute.
        this.minute = minute;
    }

    public int getSecond() {
        // Read second.
        return second;
    }

    public void setSecond(int second) {
        // Write second.
        this.second = second;
    }

    private void setTime(int hour, int minute, int second) {
        // Check overflow for minute/second.
        if (hour >= 24 || minute >= 60 || second >= 60 || hour < 0 || minute < 0 || second < 0)
            throw new IllegalArgumentException("Illegal time representation");
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /**
     * @return Time string in 24-hour format.
     */
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", this.getHour(), this.getMinute(), this.getSecond());
    }

    /**
     * @return Time string in 12-hour format.
     */
    public String toString() {
        return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12), minute, second, (hour < 12 ? "AM" : "PM"));
    }

    /**
     * Check if minute/second overflew and fix them.
     */
    private void standardize() {
        // Try to increment minute.
        this.minute += this.second / 60;
        // Try to reset second.
        this.second %= 60;
        // Try to increment hour.
        this.hour += this.minute / 60;
        // Try to reset minute.
        this.minute %= 60;
    }

    public void tick() {
        // Increment second.
        this.second += 1;
        this.standardize();
    }

    public void incrementMinute() {
        // Increment minute.
        this.minute += 1;
        this.standardize();
    }

    public void incrementHour() {
        // Increment hour.
        this.hour += 1;
        this.standardize();
    }
}
