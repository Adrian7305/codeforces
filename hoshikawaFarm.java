import java.util.Scanner;

public class hoshikawaFarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            int input = sc.nextInt();
            if(input%2!=0){
                System.out.println("0");
            }
            else{
                int j=0;
                int combinations=0;
                while(input/2>=2*j){
                    combinations++;
                    j++;
                }
                System.out.println(combinations);
            }
        }
        sc.close();
    }
}
