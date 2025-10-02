import java.util.Scanner;
public class wordCap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        char[] sh = str.toCharArray();
        sh[0]=Character.toUpperCase(sh[0]);
        sh.toString();
        System.out.println(sh);
    }
}
