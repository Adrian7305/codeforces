import java.util.Scanner;
public class divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            int a= sc.nextInt();
            int b=sc.nextInt();
            int rem = a%b;
            if(rem==0){
                System.out.println(0);
            }
            else{
                System.out.println(b-rem);
            }
        }
        sc.close();
    }
}
