import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int max = K + 1;
        int seed = 0;


        for (int i = A; i <= B; i++) {
            Random random = new Random(i);
            int maxSeedNumber = 0;
            for (int j = 0; j < N; j++) {
                int temp = random.nextInt(K);
                if (temp > maxSeedNumber) {
                    maxSeedNumber = temp;
                }
            }
            if (maxSeedNumber < max) {
                max = maxSeedNumber;
                seed = i;
            }
        }
        System.out.println(seed);
        System.out.println(max);
    }
}