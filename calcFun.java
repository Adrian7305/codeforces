import java.util.Scanner;

public class calcFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        long evenCount = num / 2;
        long oddCount = (num + 1) / 2;

        long evenSum = evenCount * (evenCount + 1);
        long oddSum = oddCount * oddCount;

        long result = evenSum - oddSum;

        System.out.println(result);

        sc.close();
    }
}
