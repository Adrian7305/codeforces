import java.util.Scanner;
public class petyaStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        sc.close();
        int num = s1.compareToIgnoreCase(s2);
        if(num==0){
            System.out.println(0);
        }
        else if(num<0){
            System.out.println(-1);
        }
        else{
            System.out.println(1);
        }
    }
}
