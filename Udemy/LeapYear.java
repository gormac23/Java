public class LeapYear {

    public static boolean isLeapYear(int year) {
        // Valid Year
        if (year < 1 || year > 9999) {
            return false;
        }

        // Leap Year Test
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }
}

