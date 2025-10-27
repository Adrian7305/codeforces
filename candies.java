import java.util.Scanner;

public class candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong(); 
            long result = (n > 2) ? (n - 1) / 2 : 0;
            System.out.println(result);
        }

        sc.close();
    }
}
