import java.util.Scanner;
public class word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        char[] ch = str.toCharArray();
        int up=0,lw=0;
        for(char c:ch){
            if(Character.isUpperCase(c)){
                up++;
            }
            else{
                lw++;
            }
        }
        if(up>lw){
            str=str.toUpperCase();
        }
        else{
            str = str.toLowerCase();
        }
        System.out.println(str);
        sc.close();
    }
}
