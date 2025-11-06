import java.util.Scanner;

public class amazingCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] points = new int[n];

        for (int i = 0; i < n; i++) {
            points[i] = sc.nextInt();
        }

        int amazingCount = 0;
        int min = points[0];
        int max = points[0];

        for (int i = 1; i < n; i++) {
            if (points[i] > max) {
                amazingCount++;
                max = points[i];
            } else if (points[i] < min) {
                amazingCount++;
                min = points[i];
            }
        }

        System.out.println(amazingCount);
        sc.close();
    }
}
