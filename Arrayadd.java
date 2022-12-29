import java.util.*;
public class Arrayadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        System.out.println("Enter the elements of first array");
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of second array");
        for(int i = 0 ; i < n ; i++){
            b[i] = sc.nextInt();
        }
        System.out.println("Added array");
        for(int i = 0 ; i < n ; i++){
            c[i] = a[i] + b[i] ;
        }
        System.out.println("c"+Arrays.toString(c));
    }
}
