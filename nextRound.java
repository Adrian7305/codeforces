import java.util.Scanner;
public class nextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int j=0;
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        int ks = a[k-1];
        for(int i=0;i<n;i++){
            if(a[i]>=ks && a[i]>0){
                j++;
            }
        }
        System.out.println(j);
        sc.close();
    }
}
