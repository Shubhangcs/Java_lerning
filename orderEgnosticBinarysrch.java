import java.util.*;
public class orderEgnosticBinarysrch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the array elements");
        int[] a = new int[n];
        for( i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the key to be searched");
        int k = sc.nextInt();
     int b = Bsh(a , k);
     if(b == k){
         System.out.println("Key found");
     }
     else{
         System.out.println("Not found");
     }
    }
    static int Bsh(int[]a ,int key){
        int start = 0;
        int end = a.length;
        int ans = 0;
        if(start < end){
             ans = asscend(a , key);
        }
        else{
             ans = descend(a , key);
        }
        return ans;
    }
    static int asscend(int[] a , int key){
        int start = 0;
        int end = a.length;
        int mid=0;
        while(start <= end){
            mid = start + (end - start)/2;

            if(key < mid){
                end = mid-1;
            }
            else if(key >mid){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return mid;
    }
    static int descend(int[] a , int key){
        int start = 0;
        int end = a.length;
        int mid=0;
        while(start <= end){
            mid = start + (end - start)/2;

            if(key > mid){
                end = mid-1;
            }
            else if(key <mid){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return mid;
    }

    }

