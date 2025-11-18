import java.util.Scanner;

public class buyShovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int change = sc.nextInt();
        sc.close();
        int total = price;
        int bought =1;
        while(true){
            if(total%10==0 || total%10==change){
                break;
            }
            total+=price;
            bought++;
        }
        System.out.println(bought);
    }
}
