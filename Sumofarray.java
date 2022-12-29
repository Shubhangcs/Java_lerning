import java.util.*;
public class Sumofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements");
        for(int i = 0 ; i < n ; i++){
             a[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++){
            sum = sum + a[i] ;
        }
        System.out.println("The sum is = "+sum);

        double avg = sum/n;
        System.out.println("Avrage is = "+avg);
    }
}
