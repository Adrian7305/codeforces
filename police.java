import java.util.Scanner;
public class police{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int crimes = 0;
        int police =0;
        for(int i=0;i<num;i++){
            int event = sc.nextInt();
            if(event>0){
                police+=event;
            }
            else{
                if(police>=1){
                    police--;
                }
                else{
                    crimes++;
                }
            }
        }
        System.out.println(crimes);
        sc.close();
    }
}