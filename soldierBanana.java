import java.util.Scanner;
public class soldierBanana{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int n = sc.nextInt();
    int w = sc.nextInt();
    int amount = 0;
    for(int i=1;i<=w;i++){
        amount+= i*k;
    }
    if(amount<=n){
        System.out.println(0);
    }
    else if(amount>n){
        System.out.println(amount-n);
    }
    sc.close();
    }
}