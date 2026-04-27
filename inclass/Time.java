/**
 * @author Shunzhong Zhu
 * @version 0.1.1
 * @since 2026-04-22
 */
public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(0);
    }

    public Time(int hour) {
        this(hour, 0);
    }

    public Time(int hour, int minute) {
        this(hour, minute, 0);
    }

    public Time(int hour, int minute, int second) {
        this.setTime(hour, minute, second);
    }

    public Time(Time time) {
        this(time.hour, time.minute, time.second);
    }

    public static void main(String[] args) {
        Time time1 = new Time();
        displayTime("After time object is created", time1);
        System.out.println();
        time1.setTime(13, 27, 6);
        displayTime("After calling setTime", time1);
        System.out.println();
        try {
            time1.setTime(99, 99, 99);
        } catch (IllegalArgumentException e) {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
        displayTime("After calling setTime with invalid values", time1);
    }

    private static void displayTime(String header, Time t) {
        System.out.printf("%s%nUniversal Time: %s%nStandard time: %s%n", header, t.toUniversalString(), t);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    private void setTime(int hour, int minute, int second) {
        if (hour >= 24 || minute >= 60 || second >= 60 || hour < 0 || minute < 0 || second < 0)
            throw new IllegalArgumentException("Illegal time representation");
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", this.getHour(), this.getMinute(), this.getSecond());
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12), minute, second, (hour < 12 ? "AM" : "PM"));
    }
}
