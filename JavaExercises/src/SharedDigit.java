public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false;
        }

        boolean haveSharedDigit = false;
        int firstNumberDigit = 0;
        int secondNumberDigit = 0;

        while (firstNumber > 0 && !haveSharedDigit) {
            firstNumberDigit = firstNumber % 10;

            while (secondNumber > 0 && !haveSharedDigit) {
                secondNumberDigit = secondNumber % 10;
                if (firstNumberDigit == secondNumberDigit) {
                    haveSharedDigit = true;
                }
                secondNumber /= 10;
            }
            firstNumber /= 10;
        }
        return haveSharedDigit;
    }
}
