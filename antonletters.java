import java.util.*;
public class antonletters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        input = input.substring(1, input.length() - 1).trim();
        sc.close();
        if (input.isEmpty()) {
            System.out.println(0);
            return;
        }
        String[] letters = input.split(", ");
        Set<String> distinctLetters = new HashSet<>(Arrays.asList(letters));
        System.out.println(distinctLetters.size());
    }
}
