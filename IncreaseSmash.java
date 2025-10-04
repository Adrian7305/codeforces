import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class IncreaseSmash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            int len = sc.nextInt();
            int[] arr= new int[len];
            for(int j=0;j<len;j++){
                arr[j]=sc.nextInt();
            }
            Set<Integer> distinct = new HashSet<>();
            for (int value : arr) {
                if (value > 0) {
                    distinct.add(value);
                }
            }
            int inc = distinct.size();
            int minimumOperations;
            
            if (inc == 0) {
                minimumOperations = 0; 
            } else if (inc == 1) {
                minimumOperations = 1; 
            } else {
                minimumOperations = 2 * inc - 1;
            }
            System.out.println(minimumOperations);
        }
        sc.close();
        }
    }
