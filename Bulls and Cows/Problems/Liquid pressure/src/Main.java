import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double density = scanner.nextDouble();
        double columnHeight = scanner.nextDouble();

        System.out.println(density*columnHeight*9.8);
    }
}