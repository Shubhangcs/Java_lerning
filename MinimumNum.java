import java.util.*;
public class MinimumNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20];
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++) {
            System.out.println("Enter the element no."+(i+1));
            arr[i] = sc.nextInt();
        }
        int a = Min(arr);
        System.out.println("The minimum number is = "+a);
    }
    static int Min(int array[]){
        int num = array[0];
        for(int i = 1 ; i <= array.length ; i++){
            if(array[i] < num){
                num = array[i];
            }
            return num;
        }
        return 0;
    }
}
