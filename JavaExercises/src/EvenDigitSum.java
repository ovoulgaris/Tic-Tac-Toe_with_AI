public class EvenDigitSum {
    public static int getEvenDigitSum (int number){
        int sum = 0;
        int numberToCheck = 0;
        if(number < 0){
            return -1;
        }
        else {
            while(number > 1){
                numberToCheck = number % 10;
                if (number % 2 == 0){
                    sum += numberToCheck;
                }
                number /= 10;
            }
            return sum;
        }
    }
}
