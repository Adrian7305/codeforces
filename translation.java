import java.util.Scanner;
public class translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1= sc.next();
        String s2= sc.next();
        sc.close();
        StringBuilder sb = new StringBuilder(s1);
        sb=sb.reverse();
        s1=sb.toString();
        if(s1.equals(s2)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}