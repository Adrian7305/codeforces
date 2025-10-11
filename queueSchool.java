import java.util.Scanner;

public class queueSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int turns = sc.nextInt();
        String str = sc.next();
        sc.close();
        
        char[] ch = str.toCharArray();
        
        for (int i = 0; i < turns; i++) {
            for (int j = 1; j < num; j++) {
                if (ch[j - 1] == 'B' && ch[j] == 'G') {
                    char temp = ch[j - 1];
                    ch[j - 1] = ch[j];
                    ch[j] = temp;
                    j++;
                }
            }
        }
        
        str = new String(ch);
        System.out.println(str);
    }
}
