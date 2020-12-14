import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double area = (a+b+c)/2.0d;
        double resArea = Math.sqrt(area* (area - a) * (area - b) * (area - c));
        System.out.println(resArea);
    }
}