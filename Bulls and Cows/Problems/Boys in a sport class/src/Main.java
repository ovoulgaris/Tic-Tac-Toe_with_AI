import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstBoy = scanner.nextInt();
        int secondBoy = scanner.nextInt();
        int thirdBoy = scanner.nextInt();

        System.out.println((firstBoy <= secondBoy && secondBoy <= thirdBoy)
                || (thirdBoy <= secondBoy && secondBoy <= firstBoy));
    }
}