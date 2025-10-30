import java.util.Arrays;
import java.util.Scanner;

public class amusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        sc.close();
        String combined = s1 + s2;
        char[] ch1 = combined.toCharArray();
        char[] ch2 = s3.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch1, ch2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
