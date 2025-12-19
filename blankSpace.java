import java.util.Scanner;
public class blankSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int len = sc.nextInt();
            int maxlen = 0;
            int zeros=0;
            for(int j=0;j<len;j++){
                int num =sc.nextInt();
                if(num == 0){
                    zeros++;
                }
                if(zeros>maxlen){
                    maxlen=zeros;
                }
                if(num ==1){
                    zeros=0;
                }
            }
            System.out.println(maxlen);
        }
        sc.close();
    }
}
