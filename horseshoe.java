import java.util.Scanner;
import java.util.Arrays;
public class horseshoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        int diff=0;
        for(int i=0;i<3;i++){
            if(arr[i]==arr[i+1]){
                diff++;
            }
        }
        System.out.println(diff);
    }
}
