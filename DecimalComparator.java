public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        double x = num1 * 1000;
        double y = num2 * 1000;


        if((int)x == (int)y) {
            return true;
        } else {
            return false;
        }
    }

}