import java.util.Scanner;
public class drinks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double sum=0;
        for(int i=0;i<num;i++){
            sum+=sc.nextInt();
        }
        double res = sum/num;
        System.out.println(res);
        sc.close();
    }
}