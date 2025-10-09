import java.util.Scanner;

public class beautifulYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        y++;

        while (!check(y)) {
            y++;
        }

        System.out.println(y);
        s.close();
    }

    public static boolean check(int y) {
        String str = String.valueOf(y);
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
