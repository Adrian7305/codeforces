import java.util.Scanner;
public class easyProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag=0;
        for(int i=0;i<n;i++){
            int ans = sc.nextInt();
            if(ans==1){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("HARD");
        }
        else{
            System.out.println("EASY");
        }
        sc.close();
    }
}
