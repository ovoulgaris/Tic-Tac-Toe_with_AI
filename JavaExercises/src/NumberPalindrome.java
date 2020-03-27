public class NumberPalindrome {
    public static boolean isPalindrome (int number){
        int numberToBeReversed = Math.abs(number);
        int reverse = 0;

        while(numberToBeReversed >= 1){
            reverse += (numberToBeReversed % 10);
            if(numberToBeReversed >= 10){
                reverse *= 10;
            }
            numberToBeReversed /= 10;
        }
        return Math.abs(number)==reverse;
    }
}
