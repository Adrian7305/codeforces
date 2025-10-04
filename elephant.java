import java.util.Scanner;
public class elephant{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int quo = num/5;
        if(num%5!=0){
            quo++;
        }
        sc.close();
        System.out.println(quo);
    }
}