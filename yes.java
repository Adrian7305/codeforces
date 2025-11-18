import java.util.Scanner;
public class yes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
        String s = sc.next();
        if(s.toLowerCase().equals("yes")){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
        sc.close();
    }
}
