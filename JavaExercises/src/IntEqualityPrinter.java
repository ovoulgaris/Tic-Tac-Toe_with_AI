public class IntEqualityPrinter {
    public static void printEqual(int firstParameter, int secondParameter, int thirdParameter) {
        if (firstParameter < 0 | secondParameter < 0 | thirdParameter < 0) {
            System.out.println("Invalid Value");
        }
        else if (firstParameter == secondParameter) {
            if (firstParameter == thirdParameter) {
                System.out.println("All numbers are equal");
            }
            if (firstParameter != thirdParameter) {
                System.out.println("Neither all are equal or different");
            }
        }
        else if (firstParameter == thirdParameter) {
            System.out.println("Neither all are equal or different");
        }
        else if (thirdParameter == secondParameter) {
            System.out.println("Neither all are equal or different");
        }
        else {
            System.out.println("All numbers are different");
        }
    }
}
