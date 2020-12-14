import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = scanner.nextInt();

        int sumA = 0;
        int sumB = 0;
        int sumC = 0;
        int sumD = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            int grade = scanner.nextInt();
            if (grade == 5) {
                sumA++;
            }
            else if (grade == 4) {
                sumB++;
            }
            else if (grade == 3) {
                sumC++;
            }
            else sumD++;
        }
        System.out.printf("%d %d %d %d", sumD, sumC, sumB, sumA);
    }
}