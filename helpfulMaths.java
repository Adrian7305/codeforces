import java.util.Scanner;
import java.util.Arrays;
public class helpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        int j=0;
        int n=(str.length()+1)/2;
        Character[] ch= new Character[n];
        for(int i=0;i<str.length();i+=2){
            ch[j]=str.charAt(i);
            j++;
        }
        Arrays.sort(ch);
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
            if(i<ch.length-1){
                System.out.print("+");
            }
        }
    }
}
