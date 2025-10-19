import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class thatGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalLevels = sc.nextInt();
        
        int xCount = sc.nextInt();
        Set<Integer> xLevels = new HashSet<>();
        for (int i = 0; i < xCount; i++) {
            xLevels.add(sc.nextInt());
        }
        
        int yCount = sc.nextInt();
        Set<Integer> yLevels = new HashSet<>();
        for (int i = 0; i < yCount; i++) {
            yLevels.add(sc.nextInt());
        }
        
        Set<Integer> allLevels = new HashSet<>(xLevels);
        allLevels.addAll(yLevels);
        
        if (allLevels.size() == totalLevels) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
        sc.close();
    }
}
