import java.util.Scanner;
public class lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
         int[] denominations = {100, 20, 10, 5, 1};
        int count = 0;
        for (int bill : denominations) {
            count += num / bill;
            num %= bill;
        }
        System.out.println(count);
    }
}
