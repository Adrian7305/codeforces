import java.util.Scanner;
public class hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=num;i++){
            if(i%2==0){
                sb.append("I love ");
            }
            else{
                sb.append("I hate ");
            }
            if(i==num){
                sb.append("it");
            }
            else{
                sb.append("that ");
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
