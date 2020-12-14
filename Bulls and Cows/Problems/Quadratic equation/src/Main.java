import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double result = b * b - 4.0 * a * c;

        if (result > 0.0) {
            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            if (r1 < r2) {
                System.out.println(r1 + " " + r2);
            }
            else System.out.println(r2 + " " + r1);
        } else if (result == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println(r1);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}