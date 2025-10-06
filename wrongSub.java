import java.util.Scanner;
public class wrongSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int num = n;
        for(int i=0;i<k;i++){
        if(num%10==0){
            num/=10;
        }
        else{
            num--;
        }
        }
        System.out.println(num);
        sc.close();
    }
}
