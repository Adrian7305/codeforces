import java.util.Scanner;

public class stones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt(); 
        String str = sc.next(); 
        
        int removeCount = 0;
        
        for (int i = 0; i < len - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                removeCount++;
            }
        }
        
        System.out.println(removeCount);
        sc.close();
    }
}
