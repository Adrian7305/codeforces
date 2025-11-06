import java.util.Scanner;

public class softDrink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int totalDrink = k * l;      
        int totalLimeSlices = c * d; 
        int totalSalt = p;           

        int toastsByDrink = totalDrink / nl;
        int toastsByLime = totalLimeSlices;
        int toastsBySalt = totalSalt / np;

        int totalToasts = Math.min(toastsByDrink, Math.min(toastsByLime, toastsBySalt));
        int toastsPerFriend = totalToasts / n;

        System.out.println(toastsPerFriend);
        sc.close();
    }
}
