package HW004;

public class IsaLeapYear {
    public static void main(String[] args) {
        isaLeapYear(11600);

    }

    public static boolean isaLeapYear(int year) {
        if (year <= 1 | year >= 9999) {
            System.out.println(year + "isnt a leap year");
            return false;
        } else if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(year + "is a leap year");
            return true;

        } else if ((year % 100 == 0) && (year % 400 == 0)) {
            System.out.println(year + "is a leap year");
            return true;
        } else {
            System.out.println("is not a leap year");
            return false;
        }
    }
}
