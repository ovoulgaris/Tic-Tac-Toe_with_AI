import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage (){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average = 0;
        int counter = 0;

        while(true){
            boolean isInt = scanner.hasNextInt();
            if (isInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
                average = (double)sum / (double)counter;
            }
            else
                break;
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
        scanner.close();
    }
}
