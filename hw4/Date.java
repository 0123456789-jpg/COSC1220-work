/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-05-03
 */
public class Date {
    private static final String[] MONTHS = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    /**
     * Marker for default date formatting.
     * <ul>
     * <li>0 for Julian.</li>
     * <li>1 for Civilian.</li>
     * <li>2 for middle endian.</li>
     * </ul>
     */
    private final int type;
    private final int year;
    private final int month;
    private final int day;

    /**
     * Create a Julian date.
     *
     * @param day  Number of day in the year.
     * @param year Year.
     */
    public Date(int day, int year) {
        // Check day range.
        if (day < 1 || day > 366) throw new IllegalArgumentException("Day should be between 1 and 366");
        // Check year range.
        if (year < 0 || year > 9999) throw new IllegalArgumentException("Year should be between 0 and 9999");
        // Assign day.
        this.day = day;
        this.month = -1;
        // Assign year.
        this.year = year;
        // Assign formatting type.
        this.type = 0;
    }

    /**
     * Create a Civilian date.
     *
     * @param monthStr Month string.
     * @param day      Number of day in the month.
     * @param year     Year.
     */
    public Date(String monthStr, int day, int year) {
        // Try to parse month string.
        int month = parseMonth(monthStr);
        if (month == 0)
            throw new IllegalArgumentException("Month should be between 1 and 12, and its format should be one of the following: January, Jan, 1, 01");
        // Check day range.
        if (day < 1 || day > 31) throw new IllegalArgumentException("Day should be between 1 and 31");
        // Check year range.
        if (year < 0 || year > 9999) throw new IllegalArgumentException("Year should be between 0 and 9999");
        // Assign month.
        this.month = month;
        // Assign day.
        this.day = day;
        // Assign year.
        this.year = year;
        // Assign formatting type.
        this.type = 1;
    }

    /**
     * Create a middle endian date.
     *
     * @param month Month.
     * @param day   Number of day in the month.
     * @param year  Year.
     */
    public Date(int month, int day, int year) {
        if (month < 0 || month > 12) throw new IllegalArgumentException("Month should be between 1 and 12");
        // Check day range.
        if (day < 1 || day > 31) throw new IllegalArgumentException("Day should be between 1 and 31");
        // Check year range.
        if (year < 0 || year > 9999) throw new IllegalArgumentException("Year should be between 0 and 9999");
        // Assign month.
        this.month = month;
        // Assign day.
        this.day = day;
        // Assign year.
        this.year = year;
        // Assign formatting type.
        this.type = 2;
    }

    /**
     * Try to convert month string into number.
     * Returns 0 if match failed.
     */
    private static int parseMonth(String monthStr) {
        try {
            // Try to match month by number.
            int month = Integer.parseInt(monthStr);
            if (month < 1 || month > 12) return 0;
            else return month;
        } catch (NumberFormatException ignored) {
        }
        // Exclude strings too short for a month.
        if (monthStr.length() <= 2) return 0;
        int month = 0;
        // Try to match month by string.
        for (int i = 0; i < 12; i++) {
            if (MONTHS[i].contains(monthStr)) {
                month = i + 1;
                break;
            }
        }
        return month;
    }

    /**
     * Shorthand method for computing days in each month with leap years in mind.
     */
    private static int[] daysInMonth(int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((year % 4 == 0)/* Leap each 4 years */ && (year % 100 != 0)/* Centurial exception */) daysInMonth[1]++;
        return daysInMonth;
    }

    /**
     * Shorthand method for parsing Julian date to year, month, and day.
     *
     * @return {year, month, day}
     */
    private static int[] julianToUniversal(int day, int year) {
        int[] daysInMonth = daysInMonth(year);
        int[] universal = {year, 0, 0};
        for (int dayCount : daysInMonth) {
            universal[1]++;
            if (day > dayCount) {
                // Breaking down days into a month.
                day -= dayCount;
            } else {
                // Insufficient days to be a full month.
                universal[2] = day;
                break;
            }
        }
        return universal;
    }

    /**
     * Shorthand method for parsing year, month, and day to Julian date.
     *
     * @return {year, day}
     */
    private static int[] universalToJulian(int year, int month, int day) {
        int[] daysInMonth = daysInMonth(year);
        int[] julian = {year, 0};
        // Accumulating days.
        for (int i = 0; i < month - 1; i++) julian[1] += daysInMonth[i];
        julian[1] += day;
        return julian;
    }

    /**
     * Getter for day.
     */
    public int getDay() {
        return day;
    }

    /**
     * Getter for month.
     */
    public int getMonth() {
        return month;
    }

    /**
     * Getter for year.
     */
    public int getYear() {
        return year;
    }

    /**
     * Getter for date formatting type.
     */
    public int getFormatType() {
        return type;
    }

    /**
     * @return Date formatted as MM/DD/YYYY.
     */
    public String toStringMiddleEndian() {
        String formatStr = "%02d/%02d/%d";
        int[] date = null;
        switch (this.type) {
            case 0: {
                // Convert Julian.
                date = julianToUniversal(this.day, this.year);
                break;
            }
            case 1:
            case 2: {
                // Direct use.
                date = new int[]{this.year, this.month, this.day};
                break;
            }
        }
        assert date != null;
        // Format string.
        return String.format(formatStr, date[1], date[2], date[0]);
    }

    /**
     * @return Date formatted as Month DD, YYYY.
     */
    public String toStringCivilian() {
        String formatStr = "%s %02d, %04d";
        int[] date = null;
        switch (this.type) {
            case 0: {
                // Convert Julian.
                date = julianToUniversal(this.day, this.year);
                break;
            }
            case 1:
            case 2: {
                // Direct use.
                date = new int[]{this.year, this.month, this.day};
                break;
            }
        }
        assert date != null;
        // Format string.
        return String.format(formatStr, MONTHS[date[1] - 1], date[2], date[0]);
    }

    /**
     * @return Date formatted as DDD YYYY.
     */
    public String toStringJulian() {
        String formatStr = "%03d %04d";
        int[] date = null;
        switch (this.type) {
            case 0: {
                // Direct use.
                date = new int[]{this.year, this.day};
                break;
            }
            case 1:
            case 2: {
                // Convert universal.
                date = universalToJulian(this.year, this.month, this.day);
                break;
            }
        }
        assert date != null;
        // Format string.
        return String.format(formatStr, date[1], date[0]);
    }

    /**
     * @return Date formatted depending on the formatting type as creation.
     */
    @Override
    public String toString() {
        // Decide format by type field.
        switch (this.type) {
            case 0:
                return this.toStringJulian();
            case 1:
                return this.toStringCivilian();
            case 2:
                return this.toStringMiddleEndian();
            default:
                // Unreachable.
                throw new IllegalStateException("Incorrect inner formatting type");
        }
    }
}
