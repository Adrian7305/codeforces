import java.util.Scanner;
public class nearlyLucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int luck = 0;
        while (num > 0) {
            long rem = num % 10;
            num = num / 10;
            if (rem == 7 || rem == 4) {
                luck++;
            }
        }
        
        if (luck == 4 || luck == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}
