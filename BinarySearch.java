import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements");
        for(int i = 0 ; i < n ; i++){
             a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to find");
        int key = sc.nextInt();
       int b =  BinarySearch(a , key);
       if(b == key){
           System.out.println("Key found");
       }
       else{
           System.out.println("Key not found");
       }
    }
    static int BinarySearch(int arr[] , int target){
        int start = 0;
        int end = arr.length;
        int mid=0;
        while(start <= end){
             mid = start + (end - start)/2;

            if(target < mid){
                end = mid-1;
            }
            else if(target >mid){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return mid;
    }
}
