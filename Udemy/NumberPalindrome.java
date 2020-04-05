public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int originalNum = number;
        int reverse = 0;
/*
        if(number < 0) {
            number *= -1;
            originalNum *= -1;
        }
*/
        while (number != 0) {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
/*
        if(reverse == originalNum) {
            return true;
        } else {
            return false;
        }

 */
        return (reverse == originalNum);
    }
}
