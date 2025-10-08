import java.util.Scanner;
public class tram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stops = sc.nextInt();
        int cap=0;
        int max=0;
        for(int i=0;i<stops;i++){
            int dep = sc.nextInt();
            int arr = sc.nextInt();
            cap = (cap-dep)+arr;
            max = Math.max(cap,max);
        }
        System.out.println(max);
        sc.close();
    }
}