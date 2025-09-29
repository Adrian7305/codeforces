import java.util.Scanner;
public class waytoolongwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            
        String n = sc.next();
        if(n.length()>10){
            char first = n.charAt(0);
            char last = n.charAt(n.length()-1);
            System.out.println(first+""+(n.length()-2)+last);
        }
        else{
            System.out.println(n);
        }
    }
    }
}
