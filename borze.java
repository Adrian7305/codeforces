import java.util.Scanner;
public class borze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        String res = "";
        for(int i=0;i<len;i++){
            if(str.charAt(i)=='.'){
                res+="0";
            }
            else if(str.charAt(i)=='-'){
                if(str.charAt(i+1)=='.'){
                    res+="1";
                }
                else{
                    res+="2";
                }
                i++;
            }
        }
        System.out.println(res);
        sc.close();
    }
}
