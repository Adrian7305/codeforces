import java.util.Scanner;

public class arrivalGeneral {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] heights = new int[n];
        
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }
        
        int maxHeight = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < n; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                maxIndex = i;
            }
        }
        
        int minHeight = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (heights[i] < minHeight) {
                minHeight = heights[i];
                minIndex = i;
            }
        }
        
        int swaps = maxIndex + (n - 1 - minIndex);
        
        if (maxIndex > minIndex) {
            swaps--;
        }
        
        System.out.println(swaps);
        scanner.close();
    }
}
