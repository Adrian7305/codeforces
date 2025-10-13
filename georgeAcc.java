import java.util.Scanner;
public class georgeAcc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int space =0;
        for(int i=0;i<num;i++){
            int p = sc.nextInt();
            int n = sc.nextInt();
            if((n-p)>=2){
                space++;
            }
        }
        System.out.println(space);
        sc.close();
    }
}
