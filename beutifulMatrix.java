import java.util.Scanner;
public class beutifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=-1,c=-1;
        int[][] arr = new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=sc.nextInt();
                if(arr[i][j]==1){
                    r=i;
                    c=j;
                }
            }
        }
        int num = Math.abs(r-2)+Math.abs(c-2);
        System.out.println(num);
        sc.close();
    }
}
