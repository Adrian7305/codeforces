import java.util.Scanner;
public class bearBigBro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int year =0;
        while(year<10000){
            if(a>b){
                break;
            }
            a=a*3;
            b=b*2;
            year++;
        }
        System.out.println(year);
    }
}
