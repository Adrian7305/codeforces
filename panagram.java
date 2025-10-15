import java.util.HashSet;
import java.util.Scanner;
public class panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str= sc.next();
        str = str.toLowerCase();
        HashSet<Character> hs = new HashSet<>();
        char[] ch = str.toCharArray();
        for(int i=0;i<num;i++){
            hs.add(ch[i]);
        }
        if(hs.size()==26){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}