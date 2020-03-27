public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit (int number){
        int sum = 0;
        if(number < 0){
            return -1;
        }
        else {
            sum = number % 10;
            while(true){
                int firstDigit = number % 10;
                if (number < 10) {
                    sum += firstDigit;
                    break;
                }
                number /= 10;
            }
            return sum;
        }
    }
}
