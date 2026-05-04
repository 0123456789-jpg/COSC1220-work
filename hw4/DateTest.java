/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-05-04
 */
public class DateTest {
    public static void main(String[] args) {
        // Test Julian.
        Date julian = new Date(114, 514);
        System.out.println("114th day of 514 as Julian: " + julian.toStringJulian());
        System.out.println("114th day of 514 as Civilian: " + julian.toStringCivilian());
        System.out.println("114th day of 514 as middle endian: " + julian.toStringMiddleEndian());
        System.out.println("==========");
        // Test Civilian.
        Date civilian = new Date("Dec", 31, 2020);
        System.out.println("Dec 31 2020 as Julian: " + civilian.toStringJulian());
        System.out.println("Dec 31 2020 as Civilian: " + civilian.toStringCivilian());
        System.out.println("Dec 31 2020 as middle endian: " + civilian.toStringMiddleEndian());
        System.out.println("==========");
        // Test middle endian.
        Date middleEndian = new Date(7, 9, 2022);
        System.out.println("07 09 2022 as Julian: " + middleEndian.toStringJulian());
        System.out.println("07 09 2022 as Civilian: " + middleEndian.toStringCivilian());
        System.out.println("07 09 2022 as middle endian: " + middleEndian.toStringMiddleEndian());
    }
}
