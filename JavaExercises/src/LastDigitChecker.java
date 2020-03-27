public class LastDigitChecker {
    public static boolean hasSameLastDigit (int firstNumber, int secondNumber, int thirdNumber){
        if (isValid(firstNumber) && isValid(secondNumber) && isValid(thirdNumber)){
            return (firstNumber % 10) == (secondNumber % 10) || (firstNumber % 10) == (thirdNumber % 10)
                    || (secondNumber % 10) == (thirdNumber % 10);
        }
        else return false;
    }

    public static boolean isValid (int number){
        return number >= 10 && number <= 1000;
    }
}
