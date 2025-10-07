import java.util.Scanner;
public class vanya {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int k= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int wid =0;
        for(int i=0;i<n;i++){
            if(arr[i]>k){
                wid+=2;
            }
            else{
                wid++;
            }
        }
        System.out.println(wid);
    }
}
