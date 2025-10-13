import java.util.Scanner;
public class magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int grp =1;
        int dis=sc.nextInt();
        for(int i=1;i<num;i++){
            int n1=sc.nextInt();
            if (n1!=dis){
                grp++;
            }
            dis=n1;
        }
        System.out.println(grp);
        sc.close();
    }
}
